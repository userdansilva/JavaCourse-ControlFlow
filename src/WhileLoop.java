public class WhileLoop {
    public static void main(String[] args) {
        printEvenNumbers(5, 20);
    }

    public static void printEvenNumbers(int start, int end) {
        int iterableNumber = start;

        int evenNumbersCount = 0;
        int oddNumbersCount = 0;

        while (iterableNumber <= end && evenNumbersCount < 5) {
            if (isEvenNumber(iterableNumber)) {
                evenNumbersCount++;
                System.out.println(iterableNumber);
            } else {
                oddNumbersCount++;
            }

            iterableNumber++;
        }

        System.out.println(evenNumbersCount + " even numbers was found");
        System.out.println(oddNumbersCount + " odd numbers was found");
    }

    public static boolean isEvenNumber(int number) {
        return (number % 2) == 0;
    }
}
