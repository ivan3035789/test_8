public class CreditPaymentService {
    public int calculate(int loanAmount, int loanTerm ) {
        float percent = (float) 9.99;
        float ratio = percent / 100 / 12;
        int outstandingBalance = (int) (loanAmount * (ratio + ratio / (Math.pow(ratio + 1,loanTerm) - 1)));
        return outstandingBalance;
    }

}