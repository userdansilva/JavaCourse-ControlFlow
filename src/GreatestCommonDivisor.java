public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(12, 30));
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }

        int smaller = Math.min(first, second);
        int commonGreatestDivisor = 1;

        for (int divisor = 1; divisor <= smaller; divisor++) {
            boolean isEvenlyDivisibleFirst = (first % divisor) == 0;
            boolean isEvenlyDivisibleSecond = (second % divisor) == 0;

            if (isEvenlyDivisibleFirst && isEvenlyDivisibleSecond) {
                commonGreatestDivisor = divisor;
            }
        }

        return commonGreatestDivisor;
    }
}
