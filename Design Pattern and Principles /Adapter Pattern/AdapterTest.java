//paymentprocessor.java
interface PaymentProcessor {
    void processPayment(double amount);
}

// Third-party gateway classes
class Razorpay {
    public void payViaRazor(double amt) {
        System.out.println("Payment of Rs." + amt + " done via Razorpay");
    }
}

class Paytm {
    public void makePaytmPayment(double amount) {
        System.out.println("Payment of Rs." + amount + " done via Paytm");
    }
}

// Adapters
class RazorpayAdapter implements PaymentProcessor {
    private Razorpay razorpay = new Razorpay();

    public void processPayment(double amount) {
        razorpay.payViaRazor(amount);
    }
}

class PaytmAdapter implements PaymentProcessor {
    private Paytm paytm = new Paytm();

    public void processPayment(double amount) {
        paytm.makePaytmPayment(amount);
    }
}

// AdapterTest.java
class AdapterTest {
    public static void main(String[] args) {
        PaymentProcessor processor1 = new RazorpayAdapter();
        processor1.processPayment(500);

        PaymentProcessor processor2 = new PaytmAdapter();
        processor2.processPayment(300);
    }
}
