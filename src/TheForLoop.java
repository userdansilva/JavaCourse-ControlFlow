public class TheForLoop {
    public static void main(String[] args) {
        for (double rate = 7.5; rate <= 10.0; rate += 0.25) {
            double interestAmount = calculateInterest(100.0, rate);
            System.out.println(interestAmount);

            if (interestAmount >= 8.5) {
                break;
            }
        }
    }

    public static double calculateInterest(double amount, double rate) {
        return amount * (rate / 100);
    }
}
