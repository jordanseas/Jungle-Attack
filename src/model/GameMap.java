package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GameMap {
    private List<Node> nodes = new ArrayList<>();
    private Map<Integer, List<Node>> neighbors = new HashMap<>(); // id del nodo → nodos vecinos

    /** Genera la cuadrícula de caminos: un nodo cada NODE_SPACING (las intersecciones se reutilizan). */
    public GameMap() {
        // TODO
    }

    /** fila * MAP_COLUMNS + columna */
    public static int zoneOf(double x, double y) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }

    /** Esquina superior izquierda de la zona. */
    public static double originX(int zoneId) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }

    public static double originY(int zoneId) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }

    public List<Node> getNeighbors(Node node) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }

    /** Nodo más cercano a un punto global. */
    public Node nearestNode(double x, double y) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }

    public Node centerOf(int zoneId) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }

    public List<Node> nodesIn(int zoneId) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }

    /** Arriba, abajo, izquierda, derecha. */
    public List<Integer> neighborZones(int zoneId) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }

    /** Segmentos de la zona en coordenadas locales {x1, y1, x2, y2}, para el cliente. */
    public List<double[]> pathsOf(int zoneId) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }
}
