package logic.monster;

import logic.attack.Attack;

public class Leader extends Monster{
    private int maxChargeTurns;
    private int currentChargeTurns;
    private boolean isGuard;

    public Leader(String name, int hp, int def, int sp_def, Attack attack, int chargeTurns) {
        super(name, hp, def, sp_def, attack);
        setMaxChargeTurns(chargeTurns);
        setCurrentChargeTurns(0);
    }

    public boolean isReady() {
        return getCurrentChargeTurns() >= getMaxChargeTurns();
    }

    public int takeDamage(Attack attack) {
        int damage = 0;
        if (!isGuard) {
            damage = attack.calculateDamage(this);
            if (attack.isLeader()) {
                setHp(getHp() - damage);
            } else {
                setHp((int) (getHp() - Math.ceil(damage*0.5)));
            }
        } else {return 0;}

        if (getHp() <= 0) {
            isDead = true;
        }
        return damage;
    }

    public int getMaxChargeTurns() {
        return maxChargeTurns;
    }

    public void setMaxChargeTurns(int maxChargeTurns) {
        this.maxChargeTurns = maxChargeTurns;
    }

    public int getCurrentChargeTurns() {
        return currentChargeTurns;
    }

    public void setCurrentChargeTurns(int currentChargeTurns) {
        int charge = Math.max(currentChargeTurns, 0);
        this.currentChargeTurns = Math.min(charge, getMaxChargeTurns());
    }

    public boolean isGuard() {
        return isGuard;
    }

    public void setGuard(boolean guard) {
        isGuard = guard;
    }
}
