package logic.systems;

import model.GameWorld;

public class CupSystem implements ITickSystem {

    @Override
    public void update(GameWorld world, long now, long deltaMs) {
        // TODO: por cada taza libre y animal de jugador vivo:
        //       si cup.tryCollect(a) → pack.addCup() + evento CUP_COLLECTED
    }
}
