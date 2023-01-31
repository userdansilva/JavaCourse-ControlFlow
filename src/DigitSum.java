public class DigitSum {
    public static void main(String[] args) {
        System.out.println(sumDigit(1234));
        System.out.println(sumDigit(-125));
        System.out.println(sumDigit(4));
        System.out.println(sumDigit(32123));
    }

    public static int sumDigit(int number) {
        if (number < 0) {
            return -1;
        }

        int sum = 0;

        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        return sum;
    }
}

