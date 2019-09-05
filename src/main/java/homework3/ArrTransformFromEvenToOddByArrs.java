package homework3;

public class ArrTransformFromEvenToOddByArrs {
    public static void main(String[] args) {
        int[] arrayToSort = new int[]{1, 2, 3, 4, 5, 3, 2, 5, 7, 9, 0, 2, 3, 4, 1};
        transformOfAray(arrayToSort);
    }

    public static int[] transformOfAray(int[] arrayToSort) {
        System.out.print("Source array:" + "\n");
        for (int i = 0; i < arrayToSort.length; i++) {
            System.out.print(arrayToSort[i] + " ");
        }

        //Посчитаем количество четных и нечетных элементов в массиве
        int cauntEven = 0;
        int cauntOdd = 0;
        for (int i = 0; i < arrayToSort.length; i++) {
            if ((0 == arrayToSort[i] % 2)) {
                cauntEven++;
            } else {
                cauntOdd++;
            }
        }

        //Создадим два массива для четных и нечетных чисел
        int[] arrayEven = new int[cauntEven];
        int[] arrayOdd = new int[cauntOdd];
        int indexOfarrayEven = 0;
        int indexOfarrayOdd = 0;
        for (int i = 0; i < arrayToSort.length; i++) {
            if ((0 == arrayToSort[i] % 2)) {
                arrayEven[indexOfarrayEven] = arrayToSort[i];
                indexOfarrayEven++;
            } else {
                arrayOdd[indexOfarrayOdd] = arrayToSort[i];
                indexOfarrayOdd++;
            }
        }
        System.out.print("\n");
        System.out.print("Even array:" + "\n");
        for (int i = 0; i < arrayEven.length; i++) {
            System.out.print(arrayEven[i] + " ");
        }
        System.out.print("\n");
        System.out.print("Odd array:" + "\n");
        for (int i = 0; i < arrayOdd.length; i++) {
            System.out.print(arrayOdd[i] + " ");
        }

        //Создадим итоговый массив
        int[] arrayResult = new int[arrayToSort.length];
        //Запись из четного массива
        for (int i = 0; i < cauntEven; i++) {
            arrayResult[i] = arrayEven[i];
        }
        //Запись из нечетного массива, место начало записи стартует с следующего элемента после последнего записанного четного
        for (int i = 0; i < cauntOdd; i++) {
            arrayResult[i + cauntEven] = arrayOdd[i];
        }
        System.out.print("\n");
        System.out.print("\n");
        System.out.print("Result array:" + "\n");
        for (int i = 0; i < arrayResult.length; i++) {
            System.out.print(arrayResult[i] + " ");
        }

        return arrayResult;
    }
}


