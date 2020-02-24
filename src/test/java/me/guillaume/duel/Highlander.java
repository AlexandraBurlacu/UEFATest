package me.guillaume.duel;

public class Highlander extends Player<Highlander> {

    private static final int HIGHLANDER_LIFE = 150;
    public static final String GREAT_SWORD = "greatSword";

    public Highlander() {
        super(HIGHLANDER_LIFE, 0, GREAT_SWORD);
        setHitPoints(HIGHLANDER_LIFE);
    }

    public Highlander(String playerType) {
        super(HIGHLANDER_LIFE, 0, GREAT_SWORD);
    }
}
