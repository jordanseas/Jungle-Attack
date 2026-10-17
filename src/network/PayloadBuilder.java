package network;

import java.util.List;
import model.GameEvent;
import model.GameWorld;
import model.MatchResult;
import model.PlayerPack;
import protocol.Payloads;

public final class PayloadBuilder {

    private PayloadBuilder() {
    }

    /** Mapa + estado inicial. */
    public static Payloads.GameStarted gameStarted(GameWorld w, PlayerPack viewer) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }

    /** Solo la zona que mira, en coordenadas locales y con packType relativo. */
    public static Payloads.StateUpdate stateUpdate(GameWorld w, PlayerPack viewer, List<GameEvent> events) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }

    public static Payloads.Summary summary(GameWorld w, MatchResult r, PlayerPack viewer) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }
}
