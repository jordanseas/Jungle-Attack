package logic.systems;

import model.GameWorld;

public class VictorySystem implements ITickSystem {

    @Override
    public void update(GameWorld world, long now, long deltaMs) {
        // TODO:
        // 1) si la bandera de un jugador isTouchedBy(...) un animal del rival → finish(rival, FLAG_TOUCHED)
        // 2) si un PlayerPack isWiped() → finish(rival, ALL_DEAD);
        //    si los dos → finish(null, ALL_DEAD) (empate)
    }
}
