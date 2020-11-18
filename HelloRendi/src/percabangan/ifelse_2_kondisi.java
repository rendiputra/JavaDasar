package percabangan;

import java.util.Scanner;

public class ifelse_2_kondisi {
    public static void main(String[] args) {
        int bilangan;

        Scanner scan = new Scanner((System.in));
        System.out.println("Masukan Nilai: ");
        bilangan = scan.nextInt();

        if (bilangan%2==0){
            System.out.println("Bilangan genap");
        } else {
            System.out.println("Bilangan Ganjil");
        }
    }
}
