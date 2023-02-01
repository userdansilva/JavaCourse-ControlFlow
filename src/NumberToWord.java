public class NumberToWord {
    public static void main(String[] args) {
        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(-12);
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }

        int digitCount = getDigitCount(number);
        number = reverse(number);

        while (digitCount > 0) {
            int lastDigit = number % 10;

            String word = switch(lastDigit) {
                case 1 -> "One";
                case 2 -> "Two";
                case 3 -> "Three";
                case 4 -> "Four";
                case 5 -> "Five";
                case 6 -> "Six";
                case 7 -> "Seven";
                case 8 -> "Eight";
                case 9 -> "Nine";

                default -> "Zero";
            };

            digitCount -= 1;
            number /= 10;

            System.out.println(word);
        }
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }

        int count = 1;

        while (number > 9) {
            count++;
            number /= 10;
        }

        return count;
    }

    public static int reverse(int number) {
        boolean isNegative = false;

        if (number < 0) {
            isNegative = true;
            number *= -1;
        }

        int reversed = 0;

        while (number > 0) {
            int digit = number % 10;

            reversed *= 10;
            reversed += digit;

            number /= 10;
        }

        if (isNegative) {
            return reversed * -1;
        }

        return reversed;
    }
}
