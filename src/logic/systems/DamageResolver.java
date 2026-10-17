package logic.systems;

import model.GameWorld;

public class DamageResolver {

    public void resolve(GameWorld world, long now) {
        // TODO:
        // 1) acumula en un Map<Integer,Integer> los golpes de quienes tienen objetivo y
        //    canAttack(now) → registerAttack() + evento ATTACK
        // 2) aplica todo junto (dos animales que se pegan a la vez reciben su golpe aunque uno muera)
        // 3) por cada muerte: evento ANIMAL_DIED; si era bot → addBotKill() al pack del atacante
        //    + evento BOT_KILLED
    }
}
