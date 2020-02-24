package me.guillaume.duel;

import java.util.HashMap;
import java.util.Map;

import static me.guillaume.duel.Equipments.valueOf;

public class Player<P extends Player<P>> {

    private Map<String, Integer> chosenEquipment=new HashMap<>();
    private int hitPoints;
    private int damage;
    private String weapon;

    public Player(int life, int damage, String weapon) {
        this.hitPoints = life;
        this.damage = damage;
        this.weapon = weapon;
    }

    public P equip(String equipment) {
        chosenEquipment.put(equipment, Equipments.valueOf(equipment).getProtect());
        return (P) this;
    }
    public void engage(Player player) {
        int numberStrike = 1;
        while (this.hitPoints() > 0 && player.hitPoints() > 0 ) {
            if (chosenEquipment.containsKey("buckler")) {
            }
            numberStrike++;
        }
    }

    private void hit (Player player) {
        player.setHitPoints(player.hitPoints() - getDamage());
        setHitPoints(hitPoints() - player.getDamage());
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
