package network;

import com.google.gson.JsonObject;

/** Strategy. */
public interface IMessageHandler {
    void handle(ClientHandler client, JsonObject payload);
}
