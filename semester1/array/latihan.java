package array;

import java.util.Scanner;
public class latihan {
    public static void main(String[] args) {
        int maksimum, jumlah, i, lokasi = 1, array[];
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen: ");
        jumlah = scan.nextInt();
        array = new int[jumlah];

        System.out.println("Masukkan "+jumlah+" angka");
        for(i = 0; i < jumlah; i++) {
            System.out.print("Elemen ke-"+ (i+1) +": " );
            array[i] = scan.nextInt();
        }
        maksimum = array[0];
        for(i = 0; i < jumlah; i++) {
            if (array[i] > maksimum){
                maksimum = array[i];
                lokasi = i+1;
            }
        }
        System.out.println("Nilai makasimum adalah "+maksimum+" berada di elemen ke "+lokasi);

    }
}