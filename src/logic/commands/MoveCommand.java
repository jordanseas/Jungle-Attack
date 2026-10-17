package logic.commands;

import java.util.List;
import model.GameWorld;
import model.PlayerPack;
import protocol.ErrorCode;

public record MoveCommand(PlayerPack pack, List<Integer> animalIds, int zoneId,
                          double localX, double localY) implements IGameCommand {

    @Override
    public ErrorCode execute(GameWorld world, long now) {
        // TODO:
        // 1) zoneId debe estar en visibleZones(pack) → si no ZONE_NOT_VISIBLE
        // 2) pasa a coordenadas globales y busca nearestNode;
        //    si está a más de PATH_SNAP_TOLERANCE → INVALID_DESTINATION
        // 3) a cada animal vivo y propio: setRoute(PathFinder.findPath(...));
        //    si ninguno sirvió → NO_ANIMALS
        throw new UnsupportedOperationException("TODO");
    }
}
