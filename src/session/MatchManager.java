package session;

import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import model.MatchResult;
import protocol.ErrorCode;

/** Singleton con holder idiom. */
public class MatchManager implements IGameListener {

    /** Guarda INSTANCE; la JVM lo crea una sola vez y de forma segura entre hilos, sin locks. */
    private static class Holder {
        private static final MatchManager INSTANCE = new MatchManager();
    }

    private ConcurrentHashMap<String, GameSession> sessions = new ConcurrentHashMap<>();
    private ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(2); // compartido por todas las partidas
    private Random random = new Random();

    private MatchManager() {
    }

    public static MatchManager getInstance() {
        return Holder.INSTANCE;
    }

    /** 4 caracteres de MATCH_CODE_CHARS. */
    public static String generateCode(Random random) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }

    public static boolean isValidNickname(String n) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }

    public static boolean isValidCode(String c) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }

    /** Repite generateCode hasta que putIfAbsent lo acepte (atómico, no hay códigos repetidos). */
    public GameSession createMatch(Player creator) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }

    /** MATCH_NOT_FOUND o el error de join. */
    public ErrorCode joinMatch(String code, Player p) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }

    /** Elimina la partida del mapa. */
    @Override
    public void onGameOver(GameSession s, MatchResult r) {
        // TODO
    }

    public int activeMatches() { return sessions.size(); }
}
