package logic.systems;

import model.GameWorld;

public interface ITickSystem {
    /** Una fase del tick. */
    void update(GameWorld world, long now, long deltaMs);
}
