package protocol;

import com.google.gson.JsonObject;

public record Message(MessageType type, JsonObject payload) {

    /** Convierte cualquier objeto a JsonObject con Gson. */
    public static Message of(MessageType type, Object payload) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }

    /** payload { code, message } */
    public static Message error(ErrorCode code) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }
}
