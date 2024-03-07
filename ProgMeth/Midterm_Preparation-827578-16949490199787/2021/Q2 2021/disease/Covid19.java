package disease;

import util.*;
import util.SevereLevel;

public class Covid19 extends Disease{
    private R0 reproductionNumber;

    private String countryOfFirstAppearance;

    public Covid19() {
        setCountryOfFirstAppearance("China");
        setReproductionNumber(2,3);
    }

    public SevereLevel severeLevel(boolean isVaccinated) {

    }

    public int minimumInfectionSpread(int n) {

    }

    public String toString() {
        return "Covid19";
    }



    public R0 getReproductionNumber() {
        return reproductionNumber;
    }

    public void setReproductionNumber(R0 reproductionNumber) {
        this.reproductionNumber = reproductionNumber;
    }

    public String getCountryOfFirstAppearance() {
        return countryOfFirstAppearance;
    }

    public void setCountryOfFirstAppearance(String countryOfFirstAppearance) {
        this.countryOfFirstAppearance = countryOfFirstAppearance;
    }
}
