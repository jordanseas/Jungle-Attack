package model;

import constants.IConstants;

public abstract class Animal extends Entity {
    private AnimalSpecies species;
    private Pack pack;
    private int energy;
    private boolean alive = true;
    private int targetId = IConstants.NO_TARGET; // objetivo actual o NO_TARGET
    private long lastAttack; // para el cooldown

    public Animal(int id, double x, double y, Pack pack) {
        super(id, x, y);
        this.pack = pack;
        // TODO: species = pack.getSpecies(); energy = getMaxEnergy();
    }

    /** Resta energía (nunca baja de 0); devuelve true si murió con ese golpe. */
    public boolean takeDamage(int amount) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }

    /** Suma energía hasta getMaxEnergy(); no revive muertos. */
    public void heal(int amount) {
        // TODO
    }

    /** Fija el objetivo; el primer golpe será 1 s después. */
    public void engage(int targetId, long now) {
        // TODO
    }

    /** now - lastAttack >= ATTACK_COOLDOWN_MS */
    public boolean canAttack(long now) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }

    /** lastAttack += ATTACK_COOLDOWN_MS */
    public void registerAttack() {
        // TODO
    }

    public void clearTarget() {
        targetId = IConstants.NO_TARGET;
    }

    public int getTargetId() { return targetId; }

    /** pack.getDamage() */
    public int getDamage() {
        return pack.getDamage();
    }

    /** Pertenecen a packs distintos (dos bots nunca se atacan entre sí). */
    public boolean isEnemyOf(Animal other) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }

    public AnimalSpecies getSpecies() { return species; }

    public Pack getPack() { return pack; }

    public int getEnergy() { return energy; }

    public boolean isAlive() { return alive; }

    public abstract int getMaxEnergy();

    /** El bot ataca solo, el jugador no. */
    public abstract boolean isAutoAttacker();
}
