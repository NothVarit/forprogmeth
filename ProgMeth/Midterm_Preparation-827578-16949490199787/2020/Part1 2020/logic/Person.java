package logic;

public class Person {
    private String name;
    private int ID;

    public Person(String name, int ID) {
        setID(ID);
        setName(name);
    }

    public void setID(int ID) {
        this.ID = Math.max(ID, 1);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }
}
