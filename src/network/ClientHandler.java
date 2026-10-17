package network;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.List;
import model.GameEvent;
import model.MatchResult;
import protocol.ErrorCode;
import protocol.Message;
import session.GameSession;
import session.IGameListener;
import session.Player;

/** Concrete Subscriber. send() es synchronized. */
public class ClientHandler implements Runnable, IGameListener {
    private BufferedReader in; // UTF-8; se reciben en el constructor
    private PrintWriter out;
    private MessageDispatcher dispatcher;
    private Player player;
    private GameSession session; // null mientras está en el lobby

    public ClientHandler(BufferedReader in, PrintWriter out, MessageDispatcher dispatcher) {
        this.in = in;
        this.out = out;
        this.dispatcher = dispatcher;
    }

    /** Lee línea por línea → dispatcher.dispatch(this, ...); en finally: session.leave(player) y cierra todo. */
    @Override
    public void run() {
        // TODO
    }

    /** Sincronizado: escriben este hilo y el hilo del tick. */
    public synchronized void send(Message m) {
        // TODO
    }

    public void sendError(ErrorCode code) {
        // TODO
    }

    /** Guarda la partida actual. */
    public void join(Player p, GameSession s) {
        this.player = p;
        this.session = s;
    }

    // --- IGameListener: arma el mensaje con PayloadBuilder y lo envía ---

    @Override
    public void onOpponentJoined(GameSession s) {
        // TODO
    }

    @Override
    public void onSelectionChanged(GameSession s) {
        // TODO
    }

    @Override
    public void onGameStarted(GameSession s) {
        // TODO
    }

    @Override
    public void onTick(GameSession s, List<GameEvent> events) {
        // TODO
    }

    /** Además deja session = null (el cliente vuelve al lobby). */
    @Override
    public void onGameOver(GameSession s, MatchResult result) {
        // TODO
    }

    /** Además deja session = null. */
    @Override
    public void onOpponentLeft(GameSession s) {
        // TODO
    }
}
