public class ArrTransformFromEvenToOdd {
    //Определим, четное ли число
        static boolean dividesByTwo(int a){
            return (a%2==0);
        }

        public static void main(String[] args) {
        int[] arrayToSort = new int[]{1, 2, 3, 4, 5, 3, 2, 5, 7, 9, 0, 2, 3, 4, 1};

        for (int i = 0; i <=arrayToSort.length ; i++) {
                System.out.println(i);
                if (dividesByTwo(arrayToSort[i])){

            }

        //for (int elem : arrayToSort) ; {//цикл размером в длину массива
         //если из двух соседних элементов один четный, а другой нет - поменяем их местами
            //if dividesByTwo(arrayToSort){
            //
            //}
        System.out.println( dividesByTwo(6) );
}
    }
}
