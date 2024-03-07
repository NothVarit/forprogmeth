package logic.card;

import logic.player.Player;

public class MageCard extends BaseCard{
    private Element mageType;

    public MageCard(String name, int power, int health, Element mageType) {
        super(name, power, health);
        setMageType(mageType);
    }

    public void play(Player player) {
        int sameE = 0;
        for (BaseCard card : player.getField()) {
            if (card instanceof OrbCard) {
                if (((OrbCard) card).getOrbType().equals(getMageType())) {
                    sameE++;
                }
            }
        }
        setPower(getPower() + sameE);
    }

    public boolean canPlay(Player player) {
        for (BaseCard card : player.getField()) {
            if (card instanceof OrbCard) {
                if (((OrbCard) card).getOrbType().equals(getMageType())) {
                    return true;
                }
            }
        }
        return false;
    }

    public Element getMageType() {
        return mageType;
    }

    public void setMageType(Element mageType) {
        this.mageType = mageType;
    }
}
