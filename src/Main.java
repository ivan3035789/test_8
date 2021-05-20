public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int outstandingBalance = service.calculate(1_000_000,12);
        System.out.println("Ежемесячный платеж : " + outstandingBalance);

        int outstandingBalance1 = (int) service.calculate(1_000_000,24);
        System.out.println("Ежемесячный платеж : " + outstandingBalance1);

        int outstandingBalance2 = (int) service.calculate(1_000_000,36);
        System.out.println("Ежемесячный платеж : " + outstandingBalance2);
    }
}