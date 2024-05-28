package task3;

public class CreditCardDemo {
    public static void main(String[] args) {
        // Constants for demo
        final Money LIMIT = new Money(1000);
        final Money FIRST_AMOUNT = new Money(200);
        final Money SECOND_AMOUNT = new Money(10, 2);
        final Money THIRD_AMOUNT = new Money(25);
        final Money FOURTH_AMOUNT = new Money(990);

        // Create a person with an address
        Person owner = new Person("Christie", "Diane", new Address("237J Harvey Hall", "Menomonie", "WI", "54751"));
        
        // Create a credit card for the person with a limit
        CreditCard visa = new CreditCard(owner, LIMIT);

        // Display owner's personal information and initial balance and credit limit
        System.out.println(visa.getPersonals());
        System.out.println("Balance: " + visa.getBalance());
        System.out.println("Credit Limit: " + visa.getCreditLimit());
        System.out.println();

        // Attempt to charge the first amount
        System.out.println("Attempt to charge " + FIRST_AMOUNT);
        visa.charge(FIRST_AMOUNT);
        System.out.println("Balance: " + visa.getBalance());

        // Attempt to charge the second amount
        System.out.println("Attempt to charge " + SECOND_AMOUNT);
        visa.charge(SECOND_AMOUNT);
        System.out.println("Balance: " + visa.getBalance());

        // Attempt to make a payment
        System.out.println("Attempt to pay " + THIRD_AMOUNT);
        visa.makePayment(THIRD_AMOUNT);
        System.out.println("Balance: " + visa.getBalance());

        // Attempt to charge an amount that exceeds the limit
        System.out.println("Attempt to charge " + FOURTH_AMOUNT);
        visa.charge(FOURTH_AMOUNT);
        System.out.println("Balance: " + visa.getBalance());
    }
}

