package me.guillaume.duel;

public class Viking extends Player<Viking> {

    public static final String AXE = "axe";
    private static int VIKING_LIFE = 120;

    public Viking() {
        super(VIKING_LIFE, 6, AXE);
        setHitPoints(VIKING_LIFE);
    }

    public Viking(String playerType) {
        super(VIKING_LIFE, 6, AXE);
    }
}
