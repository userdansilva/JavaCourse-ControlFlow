public class AllFactors {
    public static void main(String[] args) {
        printFactors(32);
    }

    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        }

        for (int divisor = 1; divisor <= number; divisor++) {
            boolean isEvenlyDivisible = (number % divisor) == 0;

            if (isEvenlyDivisible) {
                System.out.println(divisor);
            }
        }
    }
}
