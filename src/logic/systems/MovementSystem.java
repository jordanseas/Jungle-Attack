package logic.systems;

import model.GameWorld;

public class MovementSystem implements ITickSystem {

    @Override
    public void update(GameWorld world, long now, long deltaMs) {
        // TODO: a cada PlayerAnimal vivo con ruta: advance(ANIMAL_SPEED * deltaMs / 1000.0)
    }
}
