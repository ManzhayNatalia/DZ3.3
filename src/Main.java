public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int credit = 1000000;
        float percent = 9.99f;

        System.out.println(service.calculate(percent, 12, credit));

        System.out.println(service.calculate(percent, 24, credit));

        System.out.println(service.calculate(percent, 36, credit));
    }
}
