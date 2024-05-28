package task3;

public class Address {
    private String street;
    private String city;
    private String state;
    private String zipCode;

    // Constructor to initialize address
    public Address(String street, String city, String state, String zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    // Override toString method to print Address object
    @Override
    public String toString() {
        return street + ", " + city + ", " + state + " " + zipCode;
    }
}

