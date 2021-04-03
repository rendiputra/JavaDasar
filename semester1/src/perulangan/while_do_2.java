package perulangan;

import java.util.Scanner;

public class while_do_2 {
    public static void main(String[] args) {
        System.out.print("Masukan angka : ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        while (a % 2 ==0){
            System.out.println("Ini bilangan genap(Ulang lagi)");
            System.out.print("Masukan angka : ");
            a = scan.nextInt();
        }
    }
}
