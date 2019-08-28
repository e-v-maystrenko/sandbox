public class ArrTransformFromEvenToOddByArrs {
    public static void main(String[] args) {
        int[] arrayToSort = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        for (int i = 0; i < arrayToSort.length; i++) {
            System.out.print(arrayToSort[i] + " ");
        }
        int[] arrayEven = new int[arrayToSort.length];
        int[] arrayOdd = new int[arrayToSort.length];
        int cauntEven=0;
        int cauntOdd=0;
        for (int i = 0; i < arrayToSort.length; i++) {//Проходим по всему массиву
            if (!(0 == arrayToSort[i] % 2)) {//Если текущий элемент четный-запишем его в массив нечетных и наоборот
                arrayEven[i] = arrayToSort[i];
                cauntEven++;
            } else {
                arrayOdd[i] = arrayToSort[i];
                cauntOdd++;
            }
        }
        System.out.print("\n");
        for (int i = 0; i < arrayEven.length; i++) {
            System.out.print(arrayEven[i] + " ");
        }
        System.out.print("\n");
        for (int i = 0; i < arrayOdd.length; i++) {
              System.out.print(arrayOdd[i] + " ");
        }
        //Создадим еще два массива четных и нечетных чисел такого же размера, но запишем в них четные и нечетные подряд, остальное в конце - нули
        int[] arrayEvenWithout0 = new int[arrayToSort.length];
        int[] arrayOddWithout0 = new int[arrayToSort.length];
        System.out.print("\n");
        for (int i = 0; i < arrayOdd.length; i++) {
            if (arrayOdd[i]!=0){
                arrayOddWithout0[i] = arrayOdd[i];
                System.out.print(arrayOddWithout0[i] + " ");
            }
        }
        System.out.print("\n");
        for (int i = 0; i < arrayEven.length; i++) {
            if (arrayEven[i]!=0){
                arrayEvenWithout0[i] = arrayEven[i];
                System.out.print(arrayEvenWithout0[i] + " ");
            }
        }
    }
}


