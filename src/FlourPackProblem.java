public class FlourPackProblem {
    public static void main(String[] args) {
        System.out.println(!canPack(1, 0, 4));
        System.out.println(canPack(3, 0, 15));
        System.out.println(!canPack(2, 7, 18));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        boolean isParamsPositive = bigCount >= 0 && smallCount >= 0 && goal >= 0;

        if (!isParamsPositive) {
            return false;
        }

        int big = 5;

        while (bigCount > 0 && goal >= big) {
            bigCount--;
            goal -= big;
        }

        return goal <= smallCount;

//        int totalBig = bigCount * big;
//        int totalSmall = smallCount * small;
//        int total = totalBig + totalSmall;
//
//        if ((goal < big && bigCount > 0 && totalSmall < goal) || goal > total) {
//            return false;
//        }
//
//        int totalBigPackable = 0;
//
//        while ((goal - totalBigPackable) >= big) {
//            totalBigPackable += big;
//        }
//
//        total = totalBigPackable + totalSmall;
//
//        return total >= goal;
//        return false;
    }
}
