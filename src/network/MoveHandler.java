package network;

import com.google.gson.JsonObject;

public class MoveHandler implements IMessageHandler {

    @Override
    public void handle(ClientHandler client, JsonObject payload) {
        // TODO: arma MoveCommand → session.submit(cmd, client::sendError); si devuelve error → sendError
    }
}
