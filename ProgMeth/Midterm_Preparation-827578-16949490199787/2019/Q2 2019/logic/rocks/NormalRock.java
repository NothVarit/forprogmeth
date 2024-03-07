package logic.rocks;

import logic.zombies.*;

public class NormalRock {
    protected int damage;

    public NormalRock(int damage) {
        setDamage(damage);
    }

    public void setDamage(int damage) {
        this.damage = Math.max(damage, 0);
    }

    public int getDamage() {
        return this.damage;
    }

    public int dealDamage(Zombie zombie) {

        if (zombie.getDefense() >= getDamage()) {
            return 0;
        } else {
            int reduceHealth = getDamage() - zombie.getDefense();
            zombie.setHealth(zombie.getHealth() - reduceHealth);
            return reduceHealth;
        }

    }


    public String toString() {
        return "Normal Rock (" + getDamage() + ")";
    }



}
