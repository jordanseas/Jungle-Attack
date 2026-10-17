package network;

import com.google.gson.JsonObject;

public class ViewZoneHandler implements IMessageHandler {

    @Override
    public void handle(ClientHandler client, JsonObject payload) {
        // TODO: arma ViewZoneCommand → session.submit(cmd, client::sendError)
    }
}
