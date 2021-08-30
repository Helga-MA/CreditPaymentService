public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        double creditMonth12 = service.calculate(1_000_000, 12);
        System.out.println("Payment: " + creditMonth12);

        double creditMonth24 = service.calculate(1_000_000, 24);
        System.out.println("Payment: " + creditMonth24);

        double creditMonth36 = service.calculate(1_000_000, 36);
        System.out.println("Payment: " + creditMonth36);

    }
}
