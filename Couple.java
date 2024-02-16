// Couple.java
public class Couple {
    Person bride, groom;

    public Couple(Person bride, Person groom) {
        this.bride = bride;
        this.groom = groom;
    }

    public String GetBride(){
        return bride.first_name + " " + bride.last_name;
    }

    public String GetGroom(){
        return groom.first_name + " " + groom.last_name;
    }
}
