public class Customer {

    private String firstName;
    private String lastName;
    private String username;
    private int id;

    Customer(String firstname, String lastName, String username){
        this.firstName = firstname;
        this.lastName = lastName;
        this.username = username;
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

    public String toString(){
        return "username: " + username + " name: " + firstName + " " + lastName + " " + id;
    }
}
