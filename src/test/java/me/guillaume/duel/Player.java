package me.guillaume.duel;

import java.util.List;

public class Player<P extends Player<P>> {

    private List<String> equipment;
    private int hitPoints;
    private int damage;

    public Player(int life, int damage) {
        this.hitPoints = life;
        this.damage = damage;
    }

    public P equip(String equipment) {
        this.equipment.add(equipment);
        return (P) this;
    }
    public void engage(Player player) {
        while (this.hitPoints() > 0 && player.hitPoints() > 0 ) {
            player.setHitPoints(player.hitPoints() - getDamage());
            setHitPoints(hitPoints() - player.getDamage());
        }
    }

    public int hitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        if (hitPoints < 0)
            this.hitPoints = 0;
        else
            this.hitPoints = hitPoints;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
