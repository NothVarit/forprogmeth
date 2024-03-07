package logic.card;

import logic.player.Player;

public abstract class BaseCard {
    private String name;
    private int power;
    private int health;

    public BaseCard(String name, int power, int health) {
        setHealth(health);
        setName(name);
        setPower(power);
    }

    public abstract void play(Player player);

    public abstract boolean canPlay(Player player);

    public int attack(BaseCard target) {
        int damage = getPower()-target.getHealth();
        target.setHealth(Math.max(0, target.getHealth() - getPower()));
        return Math.max(damage, 0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = Math.max(power, 0);
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = Math.max(health, 0);
    }
}
