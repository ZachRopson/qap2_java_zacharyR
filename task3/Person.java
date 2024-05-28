package task3;

public class Person {
    private String firstName;
    private String lastName;
    private Address address;

    // Constructor to initialize person
    public Person(String firstName, String lastName, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    // Override toString method to print Person object
    @Override
    public String toString() {
        return firstName + " " + lastName + " " + address;
    }
}

