public class CreditPaymentService {
    public int calculate(int credit, double interestRate, int period) {

        interestRate = interestRate / 100; //процентная ставка
        double annuityRate; // коффициент аннуитета
        double m;
        int n = period * 12;
        m = interestRate / 12;
        annuityRate = (m * Math.pow((1 + m), n)) / (Math.pow((1 + m), n) - 1);
        int payment = (int) (credit * annuityRate);
        return payment;
    }
}
