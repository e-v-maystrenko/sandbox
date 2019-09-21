package subdir;

import java.util.Scanner;


public class Encrypting {
    //public static void main(String[] args) {
    public void encr() {
        Scanner in = new Scanner(System.in);
        char[] charsAlFabet = {'а', 'б', 'в', 'г', 'д', 'е', 'э', 'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ь', 'ы', 'ъ', 'э', 'ю', 'я', ' '};
        System.out.print("Введите строку для шифрования: ");
        String StringToCode = in.nextLine();
        in.close();
        boolean findChar;
        //преобразуем введенную строку в массив символов:
        char[] charInput = StringToCode.toCharArray();
        System.out.print("Зашифрованная строка:"+"\n");
        findChar = true; //флаг, обозначающий, что введенный символ нашли в нашем алфавите. Если не найдем - выведем звездочку вместо кода
        for (int j = 0; j < charInput.length; j++) {
            if (charInput[j] == ' ') {//Если в исходной строке нашли пробел - выведем вместо него три пробела для разделения цифр
                System.out.print("   ");
            }
            if (findChar == false) {
                System.out.print("* ");
            }
            findChar = false;
            for (int i = 0; i < charsAlFabet.length; i++) {
                if ((charInput[j] != ' ') & (charInput[j] == charsAlFabet[i])) {
                    System.out.print((i + 1) + " "); //напечатаем найденную цифру и пробел
                    findChar = true;
                }
                if (charInput[j] == ' ') {
                    findChar = true;
                }
            }
        }
        System.out.print("\n");
    }
}
