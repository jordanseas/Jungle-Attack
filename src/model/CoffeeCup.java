package model;

public class CoffeeCup extends Entity {
    private boolean consumed;

    public CoffeeCup(int id, double x, double y) {
        super(id, x, y);
    }

    /** Si no está consumida y a.isNear(this, CUP_RADIUS): la consume y devuelve true. */
    public boolean tryCollect(Animal a) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }

    public boolean isConsumed() { return consumed; }
}
