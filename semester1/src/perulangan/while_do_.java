package perulangan;

import java.util.Scanner;

public class while_do_ {
    public static void main(String[] args) {
//        mencetak statment menggunakan looping

        System.out.print("Masukan (Y/N) : ");
        Scanner scan = new Scanner(System.in);
        char a = scan.next().toUpperCase().charAt(0);

        while (a == 'Y'){
            System.out.println("Ini diulang");
            System.out.print("Masukan (Y/N) : ");
            a = scan.next().toUpperCase().charAt(0);
        }


    }
}
