package logic.systems;

import model.GameWorld;

public class CombatSystem implements ITickSystem {
    private TargetSelector selector = new TargetSelector();
    private DamageResolver resolver = new DamageResolver();

    @Override
    public void update(GameWorld world, long now, long deltaMs) {
        selector.update(world, now);
        resolver.resolve(world, now);
    }
}
