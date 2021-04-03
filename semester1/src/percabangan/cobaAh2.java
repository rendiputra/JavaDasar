package percabangan;

import java.util.Scanner;

public class cobaAh2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input jumlah peserta  : ");
        int jmlUser = input.nextInt();

        String[] user = new String[jmlUser];
        String[] pw = new String[jmlUser];

        // registrasi
        for (int i = 0; i < jmlUser; i++){
            System.out.println("\nREGISTRASI ke-"+(i+1));

            System.out.print("Masukan username  : ");
            user[i] = input.next();

            System.out.print("Masukan password  : ");
            pw[i] = input.next();
        }

        String[] cekUser = new String[jmlUser];
        String[] cekPw = new String[jmlUser];

        // login
        for (int i = 0; i < jmlUser; i++) {
            System.out.println("\nLogin ke-" + (i + 1));

            System.out.print("Username  : ");
            cekUser[i] = input.next();

            System.out.print("Password  : ");
            cekPw[i] = input.next();

            // validasi login
            if (cekUser[i].equals(user[i]) && cekPw[i].equals(pw[i])) {
                System.out.println("Anda berhasil login!");
            } else {
                System.out.println("username atau password yang anda masukan salah !\n");
                i--;
            }
        }
    }
}
