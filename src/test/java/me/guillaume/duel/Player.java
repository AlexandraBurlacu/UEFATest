package me.guillaume.duel;

import java.util.HashMap;
import java.util.Map;

public class Player<P extends Player<P>> {

    private Map<String, Integer> chosenEquipment=new HashMap<>();
    private int hitPoints;
    private int damage;
    private String weapon;

    public Player(int life, Weapon weapon) {
        this.hitPoints = life;
        this.damage = weapon.getDamage();
        this.weapon = weapon.getWeaponName();
    }

    public P equip(String equipment) {
        chosenEquipment.put(equipment, Equipments.valueOf(equipment).getProtect());
        return (P) this;
    }
    public void engage(Player player) {
        int numberStrike = 1;
        while (this.hitPoints() > 0 && player.hitPoints() > 0) {
            hit(this, player, numberStrike);
            hit(player, this, numberStrike);
            numberStrike++;
        }
    }

    private void hit(Player<P> player1, Player<P> player2, int numberStrike) {
        if (player2.chosenEquipment.containsKey("buckler")) {
            if (numberStrike % 2 == 0) {
                player2.setHitPoints(player2.hitPoints() - player1.getDamage());
                if(player1.weapon.equals(Weapon.axe.getWeaponName())) {
                    if (numberStrike == 6) {
                        player2.chosenEquipment.remove("buckler");
                    }
                }
            }
        } else {
            player2.setHitPoints(player2.hitPoints() - player1.getDamage());
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
