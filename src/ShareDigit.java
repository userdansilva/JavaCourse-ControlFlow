public class ShareDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 13));
    }

    public static boolean hasSharedDigit(int firstNumber, int secondNumber) {
        boolean isValidFirstNumber = firstNumber >= 10 && firstNumber <= 99;
        boolean isValidSecondNumber = secondNumber >= 10 && secondNumber <= 99;

        boolean isValidParams = isValidFirstNumber & isValidSecondNumber;

        if (isValidParams) {
            while(firstNumber > 0) {
                int digitFirstNumber = firstNumber % 10;
                int orgSecondNumber = secondNumber;

                while (secondNumber > 0) {
                    int digitSecondNumber = secondNumber % 10;

                    if (digitFirstNumber == digitSecondNumber) {
                        return true;
                    }

                    secondNumber /= 10;
                }

                secondNumber = orgSecondNumber;
                firstNumber /= 10;
            }
        }

        return false;
    }
}
