package kuis;

import java.util.Scanner;

public class soal8 {
    public static void main(String[] args) {
        int sisi ;
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukan jumlah panjang sisi: ");
        sisi = scan.nextInt();

        for (int i=1; i<=sisi; i++){
            for (int j=1; j<=sisi; j++){
                if (j== 1 || j==sisi || i==1 || i==sisi){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

    }
}
