// Strategy interface
interface PaymentStrategy {
    void pay(double amount);
}

// Concrete strategy: Credit Card
class CreditCardPayment implements PaymentStrategy {
    public void pay(double amount) {
        System.out.println("Paid Rs." + amount + " using Credit Card");
    }
}

// Concrete strategy: PayPal
class PayPalPayment implements PaymentStrategy {
    public void pay(double amount) {
        System.out.println("Paid Rs." + amount + " using PayPal");
    }
}

// Context class using strategy
class PaymentContext {
    private PaymentStrategy strategy;

    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void executePayment(double amount) {
        strategy.pay(amount);
    }
}

// Test class for Strategy Pattern
class StrategyTest {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();
        context.setStrategy(new CreditCardPayment());
        context.executePayment(1000);

        context.setStrategy(new PayPalPayment());
        context.executePayment(500);
    }
}
