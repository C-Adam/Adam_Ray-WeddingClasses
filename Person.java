public class Person {
    String first_name, last_name;

    public Person(String first_name, String last_name){
        this.first_name = first_name;
        this.last_name = last_name;
    }

    public String GetFirstName(){return first_name;}
    public String GetLastName(){return last_name;}
}
