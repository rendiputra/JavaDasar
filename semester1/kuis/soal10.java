package kuis;

import java.util.Scanner;

public class soal10 {
    public static void main(String[] args) {
        int tinggi ;
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukan jumlah tinggi segitiga: ");
        tinggi = scan.nextInt();

        for (int i=tinggi; i>=1; i--){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
