public class CreditPaymentService {
    public int calculate(float percent, int month, int credit) {
        float mPercent = percent / 12 / 100;
        int result = (int) Math.floor((mPercent * Math.pow(1 + mPercent, month) / (Math.pow(1 + mPercent, month) - 1)) * credit);
        return result;
    }
}
