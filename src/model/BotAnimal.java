package model;

import constants.IConstants;

public class BotAnimal extends Animal {

    public BotAnimal(int id, double x, double y, Pack pack) {
        super(id, x, y, pack);
    }

    @Override
    public int getMaxEnergy() { return IConstants.BOT_ENERGY; }

    @Override
    public boolean isAutoAttacker() { return true; }
}
