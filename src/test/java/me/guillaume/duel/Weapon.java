package me.guillaume.duel;

public enum Weapon {
    axe("axe", 6),
    sword("sword", 5),
    greatSword("greatSword", 5);

    private final int damage;
    private final String weaponName;
    Weapon(String weaponName, int damage) {
        this.damage = damage;
        this.weaponName = weaponName;
    }

    public int getDamage() {
        return damage;
    }

    public String getWeaponName() {
        return weaponName;
    }
}
