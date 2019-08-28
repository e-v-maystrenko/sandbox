//Этот метод короткий, но в результате нечетные элементы отображаются не в том порядке, в каком были в исходнике.

public class ArrTransformFromEvenToOddByBubble {
    public static void main(String[] args) {
        int[] arrayToSort = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        for (int i = 0; i < arrayToSort.length; i++) {
            System.out.print(arrayToSort[i] + " ");
        }

        for (int i = 0; i < arrayToSort.length; i++) {
            if (!(0 == arrayToSort[i] % 2)) {//Если текущий элемент нечетный - меняем его местами с ближайшим следующим четным
                for (int j = i; j < arrayToSort.length; j++) {
                    if (0 == arrayToSort[j] % 2) {
                        int buffer = arrayToSort[i];
                        arrayToSort[i] = arrayToSort[j];
                        arrayToSort[j] = buffer;
                        break;
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

