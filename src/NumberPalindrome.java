public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
    }

    public static boolean isPalindrome(int number) {
        if (number < 0) {
            number *= -1;
        }

        int orgNumber = number;
        int reverse = 0;

        while (number > 0) {
            int lastDigit = number % 10;

            reverse *= 10;
            reverse += lastDigit;

            number /= 10;
        }

        return reverse == orgNumber;
    }
}
