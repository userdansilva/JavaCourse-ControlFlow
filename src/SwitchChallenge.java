public class SwitchChallenge {
    public static void main(String[] args) {
        String message = getNATO('A') + " "
                + getNATO('B') + " "
                + getNATO('C');

        System.out.println(message);
    }

    public static String getNATO(char letter) {
        return switch (letter) {
            case 'A' -> "Able";
            case 'B' -> "Baker";
            case 'C' -> "Charlie";
            case 'D' -> "Dog";
            case 'E' -> "Easy";
            default -> "Letter was not mapped";
        };
    }
}
