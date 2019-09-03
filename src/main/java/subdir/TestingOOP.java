package subdir;
import homework3.ArrTransformFromEvenToOddByArrs;

import static homework3.ArrTransformFromEvenToOddByArrs.transformOfAray;

public class TestingOOP {
    public static void main(String[] args) {
        ArrTransformFromEvenToOddByArrs objectOfAnotherClass = new ArrTransformFromEvenToOddByArrs();
        int[] arrayToSort = new int[]{1, 2, 3, 4, 5, 3, 2, 5, 7, 9, 0, 2, 3, 4, 1};
        transformOfAray(arrayToSort);
    }
}
