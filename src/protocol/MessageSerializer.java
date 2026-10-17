package protocol;

import com.google.gson.Gson;
import com.google.gson.JsonParseException;

public final class MessageSerializer {
    private static final Gson GSON = new Gson();

    private MessageSerializer() {
    }

    /** Una sola línea. */
    public static String toJson(Message m) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }

    /** Lanza JsonParseException si el JSON es inválido. */
    public static Message fromJson(String line) throws JsonParseException {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }
}
