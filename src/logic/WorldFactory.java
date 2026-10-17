package logic;

import java.util.Random;
import model.AnimalSpecies;
import model.GameMap;
import model.GameWorld;

public class WorldFactory {
    private Random random; // se inyecta (semilla fija en las pruebas)

    public WorldFactory(Random random) {
        this.random = random;
    }

    public GameWorld create(GameMap map, String nick1, AnimalSpecies sp1,
                            String nick2, AnimalSpecies sp2, long now) {
        // TODO
        // 1. Baraja las 12 zonas y toma 7 distintas.
        // 2. Jugadores: bandera en el centro de su zona y 10 animales en closestNodes(...).
        // 3. Bots: 4 animales en el centro de su zona, separados BOT_SPREAD.
        // 4. Tazas: 10 nodos al azar que no estén en zonas de jugadores ni repetidos.
        throw new UnsupportedOperationException("TODO");
    }
}
