public class SavingsAccount extends Account {

    private double interestRate;

    // default constructor
    public SavingsAccount() {
        super();
    }
    public SavingsAccount(int accountNumber, double fee) {
        super(accountNumber);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public  double calcInterest() {
        return balance * interestRate;
    }

    public void applyInterest() {
        double intrest = calcInterest();
        System.out.printf("Intrest amount %.2f added to balance");
        deposit(intrest);
    }


    public void deposit(double amount) {

        // First Check amount
        if( amount > 0) {
            balance += amount;
            System.out.printf("Amount %.2f deposited%n", amount);

            // Apply Transaction Fee
            System.out.printf("Current Balance is: %.2f%n", balance);

        } else {
            System.out.println("A negative amount cannot be deposited");
        }
    }

    public void withdraw(double amount) {

        // Same check
        if(amount > 0) {
            // Check sufficient balance
            System.out.printf("Amount of %.2f withdrawn from Account%n", amount);
            balance -= amount;
            System.out.printf("Current Balance is: %.2f%n", balance);
        } else {
            System.out.println("Negative amount cannot be withdrawn!");
        }
    }

}
