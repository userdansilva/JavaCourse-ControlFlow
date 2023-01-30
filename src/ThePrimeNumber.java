public class ThePrimeNumber {

    public static void main(String[] args) {
        int counter = 0;

        for (int i = 566; (counter < 3) && (i <= 1000); i++) {
            if (isPrime(i)) {
                System.out.println(i);
                counter++;
            }
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 3) {
            return true;
        }

        int loopLimit = Math.min(number, 9);

        for (int divisor = 2; divisor < loopLimit; divisor++) {
            boolean isEvenlyDivisible = (number % divisor) == 0;

            if (isEvenlyDivisible) {
                return false;
            }
        }

        return true;
    }
}
