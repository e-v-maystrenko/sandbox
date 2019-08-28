public class ArrTransformFromEvenToOddByArrs {
    public static void main(String[] args) {
        int[] arrayToSort = new int[]{8, 5, 0, 4, 3, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        System.out.print("Source array:"+"\n");
        for (int i = 0; i < arrayToSort.length; i++) {
            System.out.print(arrayToSort[i] + " ");
        }
        int[] arrayEven = new int[arrayToSort.length];
        int[] arrayOdd = new int[arrayToSort.length];
        int cauntEven=0;
        int cauntOdd=0;
        for (int i = 0; i < arrayToSort.length; i++) {
            if ((0 == arrayToSort[i] % 2)) {//Если текущий элемент четный-запишем его в массив нечетных и наоборот
                arrayEven[i] = arrayToSort[i];
                cauntEven++;
            } else {
                arrayOdd[i] = arrayToSort[i];
                cauntOdd++;
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
        //Создадим еще два массива четных и нечетных чисел такого же размера, но запишем в них четные и нечетные подряд, остальное в конце - нули
        int[] arrayEvenWithout0 = new int[arrayToSort.length];
        int[] arrayOddWithout0 = new int[arrayToSort.length];

        //Если в исходном массиве элемент !=0, запишем его в первый найденный ненулевой элемент результирующего массива четных
        for (int i = 0; i < arrayEven.length; i++) {
            for (int j = 0; j < arrayEven.length; j++) {
                if ((arrayEven[i] != 0)&&(0==arrayEvenWithout0[j])) {
                    arrayEvenWithout0[j] = arrayEven[i];
                    break;
                }
            }
        }
        System.out.print("\n");
        System.out.print("Even array without 0 between numbers:"+"\n");
        for (int i = 0; i < arrayEvenWithout0.length; i++) {
            System.out.print(arrayEvenWithout0[i] + " ");
        }

        //Если в исходном массиве элемент !=0, запишем его в первый найденный ненулевой элемент результирующего массива нечетных

        for (int i = 0; i < arrayOdd.length; i++) {
            for (int j = 0; j < arrayOdd.length; j++) {
                if ((arrayOdd[i] != 0)&&(0==arrayOddWithout0[j])) {
                    arrayOddWithout0[j] = arrayOdd[i];
                    break;
                }
            }
        }
        System.out.print("\n");
        System.out.print("Odd array without 0 between numbers:"+"\n");
        for (int i = 0; i < arrayOddWithout0.length; i++) {
            System.out.print(arrayOddWithout0[i] + " ");
        }

        //Создадим итоговый массив, куда запишем все ненулевые элементы
        int[] arrayResult = new int[arrayToSort.length];
        //Запись из четного массива
        for (int i = 0; i < arrayResult.length; i++) {
            if (arrayEvenWithout0[i]!=0) {
                arrayResult[i] = arrayEvenWithout0[i];
            }
        }
        //Запись из нечетного массива, место начало записи стартует с следующего элемента после последнего записанного четного
        for (int i = 0; i < arrayToSort.length; i++) {
            if (arrayOddWithout0[i]!=0) {
               arrayResult[i+cauntEven] = arrayOddWithout0[i];
            }
        }
        System.out.print("\n");
        System.out.print("\n");
        System.out.print("Result array:"+"\n");
        for (int i = 0; i < arrayResult.length; i++) {
            System.out.print(arrayResult[i] + " ");
        }

    }
}


