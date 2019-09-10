package subdir;
import homework3.ArrTransformFromEvenToOddByArrs;
import homework3.SumElemsOfArr;


import static homework3.ArrTransformFromEvenToOddByArrs.transformOfAray;
import static homework3.SumElemsOfArr.sum;

public class TestingOOP {
    public static void main(String[] args) {
        int[] arrayToSort = new int[]{1, 2, 3, 4, 5, 3, 2, 5, 7, 9, 0, 2, 3, 4, 0};
        transformOfAray(arrayToSort);

        int[] arrayToSum = new int[]{1, 2, 3, 4, 5, 3, 2, 5, 7, 9, 0, 2, 3, 4, 1};
        sum(arrayToSum);
    }
}
