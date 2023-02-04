import java.util.Scanner;

public class MinAndMax {
    public static void main(String[] args) {
        minAndMax();
    }

    public static void minAndMax() {
        int min = 0;
        int max = 0;
        int loopCount = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Please enter a number, or any character to quit:");
            String input = scanner.nextLine();

            try {
                int number = Integer.parseInt(input);

                if (loopCount == 0 || number < min) {
                    min = number;
                }

                if (loopCount == 0 || number > max) {
                    max = number;
                }

                loopCount++;
            } catch (NumberFormatException nfe) {
                break;
            }
        }

        if (loopCount > 0) {
            System.out.println("Min number = " + min + " and max number = " + max);
        } else {
            System.out.println("No valid data entered");
        }
    }
}
