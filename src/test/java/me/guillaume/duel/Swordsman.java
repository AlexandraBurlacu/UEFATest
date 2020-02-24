package me.guillaume.duel;

import javax.print.DocFlavor;

public class Swordsman extends Player<Swordsman> {

    public static final String SWORD = "sword";
    private static int SWORDSMAN_LIFE = 100;


    public Swordsman() {
        super(SWORDSMAN_LIFE, 5, SWORD);
        setHitPoints(SWORDSMAN_LIFE);
    }

    public Swordsman(String playerType) {
        super(SWORDSMAN_LIFE, 5, SWORD);
    }
}
