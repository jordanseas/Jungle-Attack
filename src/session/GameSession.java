package session;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.function.Consumer;
import logic.GameEngine;
import logic.commands.IGameCommand;
import model.AnimalSpecies;
import model.MatchResult;
import protocol.ErrorCode;

/** Publisher del Observer. join, selectSpecies y leave son synchronized. */
public class GameSession {

    public enum State { WAITING, SELECTING, PLAYING, FINISHED }

    private String code;
    private State state = State.WAITING;
    private List<Player> players = new ArrayList<>();
    private List<IGameListener> listeners = new ArrayList<>();
    private GameEngine engine;
    private ConcurrentLinkedQueue<Runnable> commands = new ConcurrentLinkedQueue<>();
    private ScheduledExecutorService scheduler;
    private ScheduledFuture<?> loop;
    private Random random = new Random();
    private long lastTick;

    public GameSession(String code, ScheduledExecutorService scheduler) {
        this.code = code;
        this.scheduler = scheduler;
    }

    /** MATCH_FULL, NICKNAME_TAKEN; con 2 jugadores → onOpponentJoined + onSelectionChanged. */
    public synchronized ErrorCode join(Player p) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }

    /** WRONG_PHASE, SPECIES_TAKEN; cuando eligen los dos → start(). */
    public synchronized ErrorCode selectSpecies(Player p, AnimalSpecies s) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }

    public List<AnimalSpecies> availableSpecies() {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }

    /** WorldFactory + onGameStarted + programa tick() cada TICK_MS. */
    private void start() {
        // TODO
    }

    /**
     * Si state != PLAYING → WRONG_PHASE de inmediato.
     * Si no, encola () -> { e = engine.execute(command, now); if (e != null) onError.accept(e); }
     * y devuelve null.
     */
    public ErrorCode submit(IGameCommand command, Consumer<ErrorCode> onError) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Ejecuta los comandos encolados, engine.update(...), onTick(...), y termina si hay ganador.
     * Atrapa RuntimeException para que el scheduler no se detenga.
     */
    public void tick() {
        // TODO
    }

    /** En juego: encola la victoria del rival (OPPONENT_LEFT); antes: cancela y avisa onOpponentLeft. */
    public synchronized void leave(Player p) {
        // TODO
    }

    /** Cancela el loop + onGameOver. */
    private void finish(MatchResult r) {
        // TODO
    }

    public void addListener(IGameListener l) { listeners.add(l); }

    public void removeListener(IGameListener l) { listeners.remove(l); }

    public Player opponentOf(Player p) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }

    public GameEngine getEngine() { return engine; }

    public String getCode() { return code; }

    public State getState() { return state; }
}
