import java.util.Scanner;

public class ReadingUserInput {
    public static void main(String[] args) {
        System.out.println(getInputFromConsole(2023));
        System.out.println(getInputFromScanner(2023));
    }

    public static String  getInputFromConsole(int currentYear) {
        String inputBirthYear = System.console().readLine("What is birth year? ");
        int birthYear = Integer.parseInt(inputBirthYear);
        int age = currentYear - birthYear;

        System.out.println("Well, you probably is " + age + " years old");

        return "";
    }

    public static String getInputFromScanner(int currentYear) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scanner.nextLine();

        System.out.println("What is your birth day?");
        String inputBirthYear = scanner.nextLine();

        int birthYear = Integer.parseInt(inputBirthYear);
        int age = currentYear - birthYear;

        return "Hi " + name + ", you probably is " + age + " years old";
    }
}
