package network;

import com.google.gson.JsonObject;

public class AttackHandler implements IMessageHandler {

    @Override
    public void handle(ClientHandler client, JsonObject payload) {
        // TODO: arma AttackCommand → session.submit(cmd, client::sendError)
    }
}
