package network;

import java.util.EnumMap;
import java.util.Map;
import protocol.MessageType;

/** Context del Strategy. */
public class MessageDispatcher {
    private Map<MessageType, IMessageHandler> handlers = new EnumMap<>(MessageType.class);

    public void register(MessageType type, IMessageHandler handler) {
        handlers.put(type, handler);
    }

    /**
     * fromJson → busca el handler. Si no hay → UNKNOWN_COMMAND.
     * Si hay error de JSON o falta un campo → MALFORMED_MESSAGE.
     */
    public void dispatch(ClientHandler client, String line) {
        // TODO
    }
}
