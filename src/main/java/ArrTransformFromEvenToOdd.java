public class ArrTransformFromEvenToOdd {
    public static void main(String[] args) {
        int[] arrayToSort = new int[]{1, 2, 3, 4, 5, 3, 2, 5, 7, 9, 0, 2, 3, 4, 1};
        for (int i = 0; i < arrayToSort.length; i++) {
            System.out.print(arrayToSort[i] + " ");
        }
        /*Выведем четность-нечетность элементов
        System.out.print("\n");
        for (int i = 0; i < arrayToSort.length; i++) {//Проходим по всему массиву
            System.out.print(arrayToSort[i] % 2 + " ");
        }
        */
        for (int i = 0; i < arrayToSort.length; i++) {//Проходим по всему массиву
            if (!(0 == arrayToSort[i] % 2)) {//Если текущий элемено нечетный - меняем его местами с ближайшим следующим четным
                for (int j = i; j < arrayToSort.length; j++) {
                    if (0 == arrayToSort[j] % 2) {
                        int buffer = arrayToSort[i];
                        arrayToSort[i] = arrayToSort[j];
                        arrayToSort[j] = buffer;
                    }
                }
            }
        }
        System.out.print("\n");
        for (int i = 0; i < arrayToSort.length; i++) {
            System.out.print(arrayToSort[i] + " ");
        }
    }
}

