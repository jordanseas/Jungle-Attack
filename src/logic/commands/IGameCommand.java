package logic.commands;

import model.GameWorld;
import protocol.ErrorCode;

public interface IGameCommand {
    /** null si todo salió bien. */
    ErrorCode execute(GameWorld world, long now);
}
