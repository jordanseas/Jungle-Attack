package network;

import com.google.gson.JsonObject;

public class CreateMatchHandler implements IMessageHandler {

    @Override
    public void handle(ClientHandler client, JsonObject payload) {
        // TODO: valida el apodo (INVALID_NICKNAME) → MatchManager.createMatch → MATCH_CREATED
    }
}
