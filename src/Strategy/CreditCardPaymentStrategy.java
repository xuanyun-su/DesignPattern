package Strategy;

public class CreditCardPaymentStrategy implements PaymentStrategy{
    private String carNumber;
    private String expiryDate;
    private String cvv;

    public CreditCardPaymentStrategy(String carNumber, String expiryDate, String cvv) {
        this.carNumber = carNumber;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paying "+amount + " using  credit card.");
    }
}
