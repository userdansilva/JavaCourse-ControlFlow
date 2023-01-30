public class SumThreeAndFive {
    public static void main(String[] args) {
        int numbersAmount = 0;
        int total = 0;

        for (int i = 1; i <= 1000 && numbersAmount < 5; i++) {
            boolean isEvenlyDivisibleByThree = (i % 3) == 0;
            boolean isEvenlyDivisibleByFive = (i % 5) == 0;

            if (isEvenlyDivisibleByThree && isEvenlyDivisibleByFive) {
                total += i;
                numbersAmount++;
            }
        }

        System.out.println(total);
    }
}
