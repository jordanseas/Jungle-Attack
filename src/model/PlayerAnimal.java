package model;

import constants.IConstants;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class PlayerAnimal extends Animal {
    private Deque<Node> route = new ArrayDeque<>(); // nodos que le faltan por recorrer

    public PlayerAnimal(int id, double x, double y, Pack pack) {
        super(id, x, y, pack);
    }

    /** También cancela el ataque. */
    public void setRoute(List<Node> path) {
        // TODO
    }

    public Deque<Node> getRoute() { return route; }

    /** Avanza hacia el siguiente nodo; si lo alcanza lo saca y sigue con el resto de la distancia. */
    public void advance(double distance) {
        // TODO
    }

    @Override
    public int getMaxEnergy() { return IConstants.MAX_PLAYER_ENERGY; }

    @Override
    public boolean isAutoAttacker() { return false; }
}
