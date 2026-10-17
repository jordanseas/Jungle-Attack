package logic;

import java.util.List;
import model.GameMap;
import model.Node;

public final class PathFinder {

    private PathFinder() {
    }

    /** BFS con un mapa de "padres"; lista vacía si no hay ruta. */
    public static List<Node> findPath(GameMap map, Node start, Node goal) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }

    /** BFS limitado; sirve para colocar a los 10 animales del jugador. */
    public static List<Node> closestNodes(GameMap map, Node start, int count) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }
}
