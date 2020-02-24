package me.guillaume.duel;

public enum Equipments {
    buckler(3),
    armor(0);

    private final int protect;
    Equipments(int protect) {
        this.protect = protect;
    }

    public int getProtect() {
        return protect;
    }
}
