import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        getInputNumbers();
    }

    public static void getInputNumbers() {
        int loopingCount = 1;
        double total = 0;
        Scanner scanner = new Scanner(System.in);

        while (loopingCount <= 5) {
            System.out.println("Enter number #" + loopingCount + ": ");
            String input = scanner.nextLine();

            try {
                double number = Double.parseDouble(input);
                total += number;
                loopingCount++;
            } catch (NumberFormatException e) {
                System.out.println("Invalid number");
            }
        }

        System.out.println("Sum of inputted values is " + total);
    }
}
