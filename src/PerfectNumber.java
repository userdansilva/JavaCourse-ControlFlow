public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }

        int sum = 0;

        for (int divisor = 1; divisor <= (number / 2); divisor++) {
            boolean isEvenlyDivisible = (number % divisor) == 0;

            if (isEvenlyDivisible) {
                sum += divisor;
            }
        }

        return sum == number;
    }
}
