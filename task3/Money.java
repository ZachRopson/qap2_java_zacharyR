package task3;

public class Money {
    private int dollars;
    private int cents;

    // Constructor with dollars and cents
    public Money(int dollars, int cents) {
        if (cents >= 100) {
            dollars += cents / 100;
            cents = cents % 100;
        }
        this.dollars = dollars;
        this.cents = cents;
    }

    // Constructor with only dollars
    public Money(int dollars) {
        this(dollars, 0);
    }

    // Copy constructor
    public Money(Money other) {
        this(other.dollars, other.cents);
    }

    // Getters for dollars and cents
    public int getDollars() {
        return dollars;
    }

    public int getCents() {
        return cents;
    }

    // Method to add two Money objects
    public Money add(Money other) {
        return new Money(this.dollars + other.dollars, this.cents + other.cents);
    }

    // Method to subtract one Money object from another
    public Money subtract(Money other) {
        int totalCents1 = this.dollars * 100 + this.cents;
        int totalCents2 = other.dollars * 100 + other.cents;
        int diffCents = totalCents1 - totalCents2;

        int newDollars = diffCents / 100;
        int newCents = diffCents % 100;

        return new Money(newDollars, newCents);
    }

    // Override equals method to compare two Money objects
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Money money = (Money) obj;

        if (dollars != money.dollars) return false;
        return cents == money.cents;
    }

    // Override toString method to print Money object
    @Override
    public String toString() {
        return "$" + dollars + "." + (cents < 10 ? "0" + cents : cents);
    }

    // Method to compare two Money objects
    public int compareTo(Money other) {
        if (this.dollars != other.dollars) {
            return this.dollars - other.dollars;
        }
        return this.cents - other.cents;
    }
}
