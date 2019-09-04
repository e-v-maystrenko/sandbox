package homework3;

public class SumElemsOfArr {
    public static void main(String[] args) {
        int[] arrayToSum = new int[]{1, 2, 3, 4, 5, 3, 2, 5, 7, 9, 0, 2, 3, 4, 1};
        sum(arrayToSum);
    }

    public static int sum(int[] arrayToSum) {
        int sumOfArrayElements = 0;
        System.out.print("array:" + "\n");
        for (int i = 0; i < arrayToSum.length; i++) {
            System.out.print(arrayToSum[i] + " ");
            sumOfArrayElements = sumOfArrayElements + arrayToSum[i];
        }
        System.out.print("\n" + "SumOfArrayElements:" + "\n" + sumOfArrayElements);
    return sumOfArrayElements;
    }
}

