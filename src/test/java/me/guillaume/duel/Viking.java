package me.guillaume.duel;

public class Viking extends Player<Viking> {

    private static int VIKING_LIFE = 120;

    public Viking() {
        super(VIKING_LIFE, Weapon.axe);
        setHitPoints(VIKING_LIFE);
    }

    public Viking(String playerType) {
        super(VIKING_LIFE, Weapon.axe);
    }
}
