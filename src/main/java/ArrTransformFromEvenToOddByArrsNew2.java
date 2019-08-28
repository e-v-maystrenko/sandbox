//Этот метод длинее, некорректно работает с нулем в исходных данных

public class ArrTransformFromEvenToOddByArrsNew2 {
    public static void main(String[] args) {
        int[] arrayToSort = new int[]{1,2,3,4,5,3,2,5,7,9,0,2,3,4,1};
        System.out.print("Source array:"+"\n");
        for (int i = 0; i < arrayToSort.length; i++) {
            System.out.print(arrayToSort[i] + " ");
        }

        //Посчитаем количество четных и нечетных элементов в массиве
        int cauntEven=0;
        int cauntOdd=0;
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

        for (int i = 0; i < arrayToSort.length; i++) {
            if ((0 == arrayToSort[i] % 2)) {//Если текущий элемент исходного массива четный
                for (int j = 0; j < arrayEven.length; j++) {//Запишем его в первый найденный нулевой элемент массива четных
                    if (0==arrayEven[j]) {
                        arrayEven[j] = arrayToSort[i];
                        break;
                    }
                }
            } else {//Если текущий элемент исходного массива нечетный
                    for (int j = 0; j < arrayOdd.length; j++) {//Запишем его в первый найденный нулевой элемент массива нечетных
                        if (0==arrayOdd[j]) {
                            arrayOdd[j] = arrayToSort[i];
                            break;
                        }
                    }
            }
        }
        System.out.print("\n");
        System.out.print("Even array:"+"\n");
        for (int i = 0; i < arrayEven.length; i++) {
            System.out.print(arrayEven[i] + " ");
        }
        System.out.print("\n");
        System.out.print("Odd array:"+"\n");
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
            arrayResult[i+cauntEven] = arrayOdd[i];
        }
        System.out.print("\n");
        System.out.print("\n");
        System.out.print("Result array:"+"\n");
        for (int i = 0; i < arrayResult.length; i++) {
            System.out.print(arrayResult[i] + " ");
        }
    }
}


