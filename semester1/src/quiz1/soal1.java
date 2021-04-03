package quiz1;

import java.util.Scanner;

public class soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input jumlah peserta    : ");
        int jmlUser = input.nextInt();

        String[] user = new String[jmlUser];
        String[] pw = new String[jmlUser];

        // proses registrasi
        for (int i=0; i<jmlUser; i++){
            System.out.println("\nREGISTRASI KE-"+(i+1) + " :");

            System.out.print("Masukan username      : ");
            user[i] = input.next();
            System.out.print("Masukan password      : ");
            pw[i] = input.next();
        }

        String[] cekUser = new String[jmlUser];
        String[] cekPw = new String[jmlUser];

        // proses login
        for (int i = 0; i<jmlUser; i++ ){
            System.out.println("\nLOGIN KE-" + (i+1)+ " :");

            System.out.print("Username    : ");
            cekUser[i] = input.next();
            System.out.print("Password    : ");
            cekPw[i] = input.next();

//            if (cekUser[i] == user[i] && cekPw[i] == pw[i]){
            if (cekUser[i].equals(user[i]) && cekPw[i].equals(pw[i])){
                System.out.println("Anda berhasil login!");
            }else {
                System.out.println("Username atau password yang anda masukan salah");
                i--;
            }
        }


    }
}
