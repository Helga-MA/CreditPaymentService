public class CreditPaymentService {
    public double calculate(int amount, int term) {

        double percent = 9.99;
        double i = percent / 100 / 12;
        double payment = amount * (i + i / (Math.pow((1 + i), term) - 1));
        payment = (int) payment;
        System.out.println("Payment: " + payment);
        return payment;

    }
}
