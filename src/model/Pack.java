package model;

import constants.IConstants;
import java.util.ArrayList;
import java.util.List;

/** Pack de bots. */
public class Pack {
    protected int id;
    protected AnimalSpecies species;
    protected List<Animal> members = new ArrayList<>();

    public Pack(int id, AnimalSpecies species) {
        this.id = id;
        this.species = species;
    }

    public List<Animal> living() {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }

    public int countDead() {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }

    /** living().isEmpty() */
    public boolean isWiped() {
        return living().isEmpty();
    }

    public int getDamage() { return IConstants.BOT_DAMAGE; }

    public boolean isBot() { return true; }

    public int getId() { return id; }

    public AnimalSpecies getSpecies() { return species; }

    public List<Animal> getMembers() { return members; }
}
