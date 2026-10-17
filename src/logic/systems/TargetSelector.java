package logic.systems;

import model.GameWorld;

public class TargetSelector {

    public void update(GameWorld world, long now) {
        // TODO:
        // 1) los bots sin objetivo eligen el enemigo vivo más cercano a ≤ ENCOUNTER_RADIUS → engage(...)
        // 2) se sueltan (clearTarget) los objetivos muertos o fuera de ENCOUNTER_RADIUS
    }
}
