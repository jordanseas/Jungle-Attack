package app;

public class ServerApp {

    /**
     * Registra los 6 handlers, abre el ServerSocket (try-with-resources) y por cada accept()
     * envía un ClientHandler al pool de hilos.
     */
    public static void main(String[] args) {
        // TODO
    }

    /** argumento → config.properties → SERVER_PORT */
    public static int resolvePort(String[] args) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }
}
