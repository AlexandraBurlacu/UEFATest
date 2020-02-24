package me.guillaume.duel;

public class Swordsman extends Player<Swordsman> {

    private static int SWORDSMAN_LIFE = 100;


    public Swordsman() {
        super(SWORDSMAN_LIFE, Weapon.sword);
        setHitPoints(SWORDSMAN_LIFE);
    }

    public Swordsman(String playerType) {
        super(SWORDSMAN_LIFE, Weapon.sword);
    }
}
