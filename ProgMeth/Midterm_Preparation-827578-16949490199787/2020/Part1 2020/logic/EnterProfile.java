package logic;

public class EnterProfile {
    private Person person;
    private int bodyTemperature;

    public EnterProfile(Person person, int bodyTemperature) {
        setBodyTemperature(bodyTemperature);
        setPerson(person);
    }

    public boolean hasFever() {
        return getBodyTemperature() >= 37;
    }

    public void setBodyTemperature(int bodyTemperature) {
        if (bodyTemperature < 35) {
            this.bodyTemperature = 35;
        } else if (bodyTemperature > 42) {
            this.bodyTemperature = 42;
        } else {
            this.bodyTemperature = bodyTemperature;
        }
    }

    public Person getPerson() {
        return person;
    }

    public int getBodyTemperature() {
        return bodyTemperature;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
