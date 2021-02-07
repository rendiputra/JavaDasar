package kuis;

import java.util.Scanner;

public class soal3 {
    public static void main(String[] args) {
        int maksimum, jumlah, i, array[];
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen: ");
        jumlah = scan.nextInt();
        array = new int[jumlah];

        System.out.println("Masukkan "+jumlah+" angka");
        for(i = 0; i < jumlah; i++) {
            System.out.print("Masukan angka ke-"+ (i+1) +": " );
            array[i] = scan.nextInt();
        }

        maksimum = array[0];
        for(i = 0; i < jumlah; i++) {
            if (array[i] > maksimum){
                maksimum = array[i];
            }
        }
        System.out.println("Bilangan terbesar adalah "+maksimum);

    }
}
