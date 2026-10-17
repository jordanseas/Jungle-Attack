package logic.commands;

import java.util.List;
import model.GameWorld;
import model.PlayerPack;
import protocol.ErrorCode;

public record AttackCommand(PlayerPack pack, List<Integer> animalIds, int targetId) implements IGameCommand {

    @Override
    public ErrorCode execute(GameWorld world, long now) {
        // TODO:
        // - el objetivo existe, está vivo y no es propio → si no INVALID_TARGET
        // - engage(...) solo a los animales propios y vivos que ya están a ≤ ENCOUNTER_RADIUS
        throw new UnsupportedOperationException("TODO");
    }
}
