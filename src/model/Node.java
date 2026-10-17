package model;

/** Punto del camino. */
public record Node(int id, double x, double y) {

    public int zoneId() {
        return GameMap.zoneOf(x, y);
    }
}
