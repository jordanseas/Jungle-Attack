package network;

import com.google.gson.JsonObject;

public class JoinMatchHandler implements IMessageHandler {

    @Override
    public void handle(ClientHandler client, JsonObject payload) {
        // TODO: valida el apodo y el código (INVALID_MATCH_CODE) → MatchManager.joinMatch
    }
}
