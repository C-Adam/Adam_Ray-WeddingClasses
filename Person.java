public class Person {
    String first_name, last_name;

    public Person(String first_name, String last_name){
        this.first_name = first_name;
        this.last_name = last_name;
    }

    public String GetFirstName(){return first_name;}
    public String GetLastName(){return last_name;}

    public static void main(String[] args) {
        System.out.println("Person Code");

        Person stranger = new Person("Adam", "Cooper");

        System.out.println(stranger.first_name);
        System.out.println(stranger.last_name);
    }
}
