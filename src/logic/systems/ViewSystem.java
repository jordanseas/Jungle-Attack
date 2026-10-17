package logic.systems;

import model.GameWorld;

public class ViewSystem implements ITickSystem {

    @Override
    public void update(GameWorld world, long now, long deltaMs) {
        // TODO: si el viewedZone de un jugador ya no está en visibleZones(...),
        //       lo cambia a la zona de uno de sus animales vivos
    }
}
