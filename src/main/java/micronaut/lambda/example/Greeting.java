package micronaut.lambda.example;

public class Greeting {

    public String getFirstName() {
        return firstName;
    }

    public Greeting(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Greeting() {
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private  String firstName;
    private  String lastName;


}
