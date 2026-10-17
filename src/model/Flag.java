package model;

public class Flag extends Entity {
    private PlayerPack owner;

    public Flag(int id, double x, double y, PlayerPack owner) {
        super(id, x, y);
        this.owner = owner;
    }

    public PlayerPack getOwner() { return owner; }

    /** a vivo, de un jugador distinto al dueño y a ≤ FLAG_RADIUS. */
    public boolean isTouchedBy(Animal a) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }
}
