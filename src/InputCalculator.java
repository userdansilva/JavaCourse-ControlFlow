import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        long avg = 0;
        int loopCount = 0;

        while (true) {
            String input = scanner.nextLine();

            try {
                int number = Integer.parseInt(input);
                loopCount++;

                sum += number;
                avg = Math.round(((double) (sum) / loopCount));
            } catch (NumberFormatException nfe) {
                break;
            }
        }

        System.out.println("SUM = " + sum + " AVG = " + avg);
    }
}
