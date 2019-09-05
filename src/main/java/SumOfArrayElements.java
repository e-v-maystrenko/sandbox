public class SumOfArrayElements {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 3, 2, 5, 7, 9, 0, 2, 3, 4, 1};
        int sumOfArrayElements=0;
        System.out.print("array:" + "\n");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            sumOfArrayElements=sumOfArrayElements+array[i];
        }
        System.out.print("\n"+"SumOfArrayElements:" + "\n"+sumOfArrayElements);
    }
}
