package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GameWorld {
    private GameMap map;
    private List<Pack> packs;
    private Map<Integer, Animal> animals = new HashMap<>();
    private List<CoffeeCup> cups;
    private List<GameEvent> events = new ArrayList<>();
    private MatchResult result;
    private long startTime;

    public GameWorld(GameMap map, List<Pack> packs, List<CoffeeCup> cups, long startTime) {
        this.map = map;
        this.packs = packs;
        this.cups = cups;
        this.startTime = startTime;
        // TODO: llenar el mapa animals con los miembros de cada pack
    }

    public GameMap getMap() { return map; }

    public List<Pack> getPacks() { return packs; }

    public List<CoffeeCup> getCups() { return cups; }

    public long getStartTime() { return startTime; }

    public Animal getAnimal(int id) { return animals.get(id); }

    public List<Animal> livingAnimals() {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }

    public List<PlayerPack> playerPacks() {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }

    public PlayerPack opponentOf(PlayerPack pack) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }

    /** Zonas con animales vivos del jugador. */
    public Set<Integer> visibleZones(PlayerPack pack) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }

    public void addEvent(GameEvent e) { events.add(e); }

    /** Devuelve y limpia. */
    public List<GameEvent> takeEvents() {
        List<GameEvent> out = new ArrayList<>(events);
        events.clear();
        return out;
    }

    public void finish(MatchResult r) { this.result = r; }

    public boolean isFinished() { return result != null; }

    public MatchResult getResult() { return result; }
}
