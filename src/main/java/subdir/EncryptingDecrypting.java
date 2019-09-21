package subdir;

import java.util.Scanner;

public class EncryptingDecrypting {
    public static void main(String[] args) {
        Encrypting encrypting = new Encrypting();
        Decrypting decrypting = new Decrypting();
        Scanner in = new Scanner(System.in);
        //System.out.print("Выберите действие" + "\n");
        //System.out.print("0 - закончить процесс" + "\n");
        //System.out.print("1 - зашифровать сообщение" + "\n");
        //System.out.print("2 - расшифровать сообщение" + "\n");
        System.out.print("Выберите действие: 0 - закончить процесс, 1 - зашифровать сообщение, 2 - расшифровать сообщение: ");
        //do {
            int choise = in.nextInt();
            if ((choise != 0) & (choise != 1) & (choise != 2)) {
               System.out.print("А так низя!!!");
            }
            if (choise == 1){
                encrypting.encr();
            }
            if (choise == 2){
                decrypting.decr();
            }

        //}while (true);
        //in.close();
    }
}
