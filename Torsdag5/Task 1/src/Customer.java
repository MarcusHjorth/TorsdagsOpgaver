public class Customer {

    private String firstName;
    private String lastName;
    private String username;
    private int id;

    Customer(String firstname, String lastName, String username, int id){
        this.firstName = firstname;
        this.lastName = lastName;
        this.username = username;
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUsername() {
        return username;
    }

    public int getId() {
        return id;
    }

    public String toString(){
        return "username: " + username + " name: " + firstName + " " + lastName + " " + id;
    }
}
