package perulangan;

import java.util.Scanner;

public class do_while_ {
    public static void main(String[] args) {
//        Menjalankan isi perulangan dulu baru di cek kondisinya
        Scanner scan = new Scanner(System.in);
        char a;
//        do {
//            System.out.print("Masukan (Y/N) : ");
//            a = scan.next().toUpperCase().charAt(0);
//        }while (a == 'Y');

        do {
            System.out.print("Masukan (Y/N) : ");
            a = scan.next().toUpperCase().charAt(0);
        }while (a != 'Y');

    }
}
