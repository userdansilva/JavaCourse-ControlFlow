public class DayOfTheWeek {
    public static void main(String[] args) {
        printDayOfWeek((byte) 0);
        printDayOfWeek((byte) 1);
    }

    public static void printDayOfWeek(byte dayNumber) {
        String dayName = getDayOfTheWeek(dayNumber);
        System.out.println(dayName);
    }

    public static String getDayOfTheWeek(byte number) {
        return switch (number) {
            case 0 -> "Monday";
            case 1 -> "Tuesday";
            case 2 -> "Wednesday";
            case 3 -> "Thursday";
            case 4 -> "Friday";
            case 5 -> "Saturday";
            case 6 -> "Sunday";
            default -> "Invalid day";
        };
    }
}
