package subdir;
import java.io.*;
import java.util.Scanner;

public class Decrypting {
    //public static void main(String[] args) {
    public void decr() {
        Scanner in = new Scanner(System.in);
        char[] charsAlFabet = {'а', 'б', 'в', 'г', 'д', 'е', 'э', 'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ь', 'ы', 'ъ', 'э', 'ю', 'я', ' '};
        System.out.print("Введите строку для расшифровки: ");
        String StringToEncode = in.nextLine();
        in.close();
        int countNumbers=0;
        int counter=0;
        //разделим введеную строку на отдельные числа, пробел - разделитель и узнаем нужную длину массива для записи
        for (String retval : StringToEncode.split(" ")) {
            countNumbers=countNumbers+1;
        }
        int[] myArray = new int[countNumbers];

        //заполним массив числами
        String[] parts = StringToEncode.split(" ");
        for (int j = 0; j <countNumbers ; j++) {
            myArray[j]=Integer.parseInt(parts[j]);
        }
        System.out.print("Расшифрованная строка:"+"\n");
        for (int j = 0; j <countNumbers ; j++) {
            System.out.print(charsAlFabet[(myArray[j])-1]+"");
        }
        System.out.print("\n");
    }
}