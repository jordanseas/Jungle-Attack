package session;

import java.util.List;
import model.GameEvent;
import model.MatchResult;

/** Subscriber del Observer. Todos los métodos son default (vacíos). */
public interface IGameListener {
    default void onOpponentJoined(GameSession s) { }

    default void onSelectionChanged(GameSession s) { }

    default void onGameStarted(GameSession s) { }

    default void onTick(GameSession s, List<GameEvent> events) { }

    default void onGameOver(GameSession s, MatchResult result) { }

    default void onOpponentLeft(GameSession s) { }
}
