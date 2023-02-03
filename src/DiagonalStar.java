public class DiagonalStar {
    public static void main(String[] args) {
        printSquareStar(8);
    }

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }

        for (int y = 1; y <= number; y++) {
            for (int x = 1; x <= number; x++) {
                if (y == 1 || x == 1
                        || y == number || x == number
                        || x == y
                        || x == (number - y + 1) ) {
                    System.out.print("*");
                    continue;
                }

                System.out.print(" ");
            }

            System.out.println();
        }
    }
}
