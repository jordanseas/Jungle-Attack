package session;

import model.AnimalSpecies;
import model.PlayerPack;

public class Player {
    private String nickname;
    private IGameListener listener;
    private AnimalSpecies species;
    private PlayerPack pack;

    public Player(String nickname, IGameListener listener) {
        this.nickname = nickname;
        this.listener = listener;
    }

    public String getNickname() { return nickname; }

    public IGameListener getListener() { return listener; }

    public AnimalSpecies getSpecies() { return species; }

    public void setSpecies(AnimalSpecies species) { this.species = species; }

    public PlayerPack getPack() { return pack; }

    public void setPack(PlayerPack pack) { this.pack = pack; }
}
