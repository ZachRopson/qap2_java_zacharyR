package task3;

public class CreditCard {
    private Person owner;
    private Money balance;
    private Money creditLimit;

    // Constructor to initialize credit card with owner and credit limit
    public CreditCard(Person owner, Money creditLimit) {
        this.owner = owner;
        this.creditLimit = new Money(creditLimit);
        this.balance = new Money(0);
    }

    // Getters for balance and credit limit
    public Money getBalance() {
        return new Money(balance);
    }

    public Money getCreditLimit() {
        return new Money(creditLimit);
    }

    // Get owner's personal information
    public String getPersonals() {
        return owner.toString();
    }

    // Method to charge an amount to the credit card
    public void charge(Money amount) {
        if (balance.add(amount).compareTo(creditLimit) > 0) {
            System.out.println("Exceeds credit limit");
        } else {
            balance = balance.add(amount);
            System.out.println("Charge: " + amount);
        }
    }

    // Method to make a payment to the credit card
    public void makePayment(Money amount) {
        balance = balance.subtract(amount);
        System.out.println("Payment: " + amount);
    }
}

