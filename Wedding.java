// Wedding.java
import java.time.LocalDate;
import javax.swing.JOptionPane;

public class Wedding {
    private final Couple couple;
    private final String weddingDate;
    private final String location;

    public Wedding(Couple couple, String weddingDate, String location) {
        this.couple = couple;
        this.weddingDate = weddingDate;
        this.location = location;
    }

    public String GetCouple() {
        return "Bride: " + couple.GetBride() + "\nGroom: " + couple.GetGroom();
    }

    public String GetDate() {return weddingDate;}

    public String GetLocation() {return location;}

    public static void main(String[] args) {
        String bride_first_name = JOptionPane.showInputDialog("What is the first name of the bride?");
        String bride_last_name = JOptionPane.showInputDialog("What is the last name of the bride?");
        String groom_first_name = JOptionPane.showInputDialog("What is the first name of the groom?");
        String groom_last_name = JOptionPane.showInputDialog("What is the last name of the groom?");

        String wedding_date = JOptionPane.showInputDialog("What date would you like to schedule your marriage? (DD/MM/YYYY)");

        String location = JOptionPane.showInputDialog("Where would you like this wedding to be held?");

        Couple couple = new Couple(new Person(bride_first_name, bride_last_name), new Person(groom_first_name, groom_last_name));

        Wedding wedding = new Wedding(couple, wedding_date, location);

        JOptionPane.showMessageDialog(null, wedding.GetCouple() + "\n" + "Wedding Date: " + wedding.GetDate() + "\n" + "Wedding Location: " + wedding.GetLocation());
    }
}
