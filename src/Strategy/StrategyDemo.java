package Strategy;

public class StrategyDemo {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // 使用信用卡支付
        PaymentStrategy creditCardStrategy = new CreditCardPaymentStrategy("1234-5678-9012-3456", "12/24", "123");
        cart.setPaymentStrategy(creditCardStrategy);
        cart.checkout(100.0);

        // 使用Paypal支付
        PaymentStrategy paypalStrategy = new PaypalPaymentStrategy("example@example.com", "password");
        cart.setPaymentStrategy(paypalStrategy);
        cart.checkout(50.0);
    }
}
