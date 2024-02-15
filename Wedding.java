// Wedding.java
import java.time.LocalDate;
import java.util.Date;

public class Wedding {
    private final Couple couple;
    private final LocalDate weddingDate;
    private final String location;

    public Wedding(Couple couple, LocalDate weddingDate, String location) {
        this.couple = couple;
        this.weddingDate = weddingDate;
        this.location = location;
    }

    public Couple getCouple() {return couple;}

    public LocalDate getWeddingDate() {return weddingDate;}

    public String getLocation() {return location;}

    public static void main(String[] args) {
        Couple couple = new Couple(new Person("Adam", "Cooper"), new Person("Aryadeep", "Ray"));
        Wedding wedding = new Wedding(couple, LocalDate.now(), "Higgins");
        System.out.println("Bride: " + wedding.couple.bride.first_name + " " + wedding.couple.bride.last_name);
        System.out.println("Groom: " + wedding.couple.groom.first_name + " " + wedding.couple.groom.last_name);
        System.out.println("Date: " + wedding.weddingDate );
        System.out.println("Location: " + wedding.location);
    }
}
