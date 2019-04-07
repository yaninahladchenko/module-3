package task2;

public class AccountingTest {
    public static void main(String[] args) {
        Accounting accounting = new Accounting();
        double calculatedPayment = accounting.pay(80, 10.25);
        System.out.println("Calculated payment is: " + calculatedPayment);
    }

}

