public class NumberOfDaysInMonth {

    public static void main(String[] args) {
        System.out.println(getDaysInMonth((byte) 1, (short) 2020));
        System.out.println(getDaysInMonth((byte) 2, (short) 2020));
        System.out.println(getDaysInMonth((byte) 2, (short) 2018));
        System.out.println(getDaysInMonth((byte) -1, (short) 2020));
        System.out.println(getDaysInMonth((byte) 1, (short) -2020));
    }

    public static int getDaysInMonth(int month, int year) {
        boolean isValidMonth = month >= 1 && month <= 12;
        boolean isValidYear = year >= 1 && year <= 9999;

        if (!isValidMonth || !isValidYear) {
            return -1;
        }

        return switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 2 -> (isLeapYear(year) ? 29 : 28);
            default -> 30;
        };
    }

    public static boolean isLeapYear(int year) {
        boolean isValidYear = year >= 1 && year <= 9999;

        if (!isValidYear) {
            return false;
        }

        boolean isEvenlyDivisibleByFour = (year % 4) == 0;
        boolean isEvenlyDivisibleByOneHundred = (year % 100) == 0;
        boolean isEvenlyDivisibleByFourHundred = (year % 400) == 0;

        return (isEvenlyDivisibleByFour && !isEvenlyDivisibleByOneHundred)
                || isEvenlyDivisibleByFourHundred;
    }
}
