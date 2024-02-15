// Couple.java
public class Couple {
    Person bride, groom;

    public Couple(Person person1, Person person2) {
        this.bride = person1;
        this.groom = person2;
    }

    public Person GetBride(){return bride;}
    public Person GetGroom(){return groom;}

    public static void main(String[] args) {
        System.out.println("Couple Code:");

        Person person1 = new Person("Adam", "Cooper");
        Person person2 = new Person("Aryadeep", "Ray");

        Couple couple = new Couple(person1, person2);

        System.out.println("Bride: " + couple.bride.first_name);
        System.out.println("Groom: " + couple.groom.first_name);
    }
}
