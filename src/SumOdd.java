public class SumOdd {
    public static void main(String[] args) {
        System.out.println(sumOdd(1, 100));
        System.out.println(sumOdd(-1, 100));
        System.out.println(sumOdd(100, 100));
        System.out.println(sumOdd(13, 13));
        System.out.println(sumOdd(100, -100));
        System.out.println(sumOdd(100, 1000));
    }

    public static int sumOdd(int start, int end) {
        boolean isValidParams = (start >= 0) && (end >= start);

        if (!isValidParams) {
            return -1;
        }

        int sum = 0;

        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sum+= i;
            }
        }

        return sum;
    }

    public static boolean isOdd(int number) {
        if (number < 0) {
            return false;
        }

        return number % 2 != 0;
    }
}
