public class NumberInWord {
    public static void main(String[] args) {
        printNumberInWord((byte) 1);
        printNumberInWord((byte) 13);
        printNumberInWord((byte) 9);
        printNumberInWord((byte) -5);
    }

    public static void printNumberInWord(byte number) {
        String numberName = getNumberWord(number);
        System.out.println(numberName);
    }

    public static String getNumberWord(byte number) {
        return switch (number) {
            case 0 -> "ZERO";
            case 1 -> "ONE";
            case 2 -> "TWO";
            case 3 -> "THREE";
            case 4 -> "FOUR";
            case 5 -> "FIVE";
            case 6 -> "SIX";
            case 7 -> "SEVEN";
            case 8 -> "EIGHT";
            case 9 -> "NINE";
            default -> "OTHER";
        };
    }
}
