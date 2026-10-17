package logic.commands;

import model.GameWorld;
import model.PlayerPack;
import protocol.ErrorCode;

public record ViewZoneCommand(PlayerPack pack, int zoneId) implements IGameCommand {

    @Override
    public ErrorCode execute(GameWorld world, long now) {
        // TODO: si zoneId está en visibleZones(pack) → setViewedZone; si no ZONE_NOT_VISIBLE
        throw new UnsupportedOperationException("TODO");
    }
}
