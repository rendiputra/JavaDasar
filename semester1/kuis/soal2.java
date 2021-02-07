package kuis;

import java.util.Scanner;

public class soal2 {
    public static void main(String[] args) {
        String  user = "qwe",
                pw  = "asd",
                inputUser,
                inputPw;
        int invalid;
        Scanner scan = new Scanner(System.in);

        for (int i=1; i<=3; i++){
            System.out.print("\nMasukan username: ");
            inputUser = scan.next();

            System.out.print("Masukan password: ");
            inputPw = scan.next();

            if (inputUser.equals(user) && inputPw.equals(pw)) {
                System.out.println("\nanda berhasil masuk");
                continue;
            }else {
                System.out.println("\nmaaf username dan password anda salah");
            }

            if (i==3){
                System.out.println("akun anda diblokir, mau ngehack ya a?");
            }
        }

    }
}
