public class Main {
    public static void main(String[] args) {

        int payment;

        System.out.println("Срок кредитования: 1 год");
        CreditPaymentService service = new CreditPaymentService();
        payment = service.calculate(1_000_000, 9.99, 1);
        System.out.println("Ежемесячный платёж составит: " + payment + " руб.");
        System.out.println();

        System.out.println("Срок кредитования: 2 года");
        payment = service.calculate(1_000_000, 9.99, 2);
        System.out.println("Ежемесячный платёж составит: " + payment + " руб.");
        System.out.println();

        System.out.println("Срок кредитования: 3 года");
        payment = service.calculate(1_000_000, 9.99, 3);
        System.out.println("Ежемесячный платёж составит: " + payment + " руб.");
        System.out.println();
    }
}