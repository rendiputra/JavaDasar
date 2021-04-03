package array;

import java.util.Scanner;

public class array_1d_kasus {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);

        System.out.print("Inputkan ukuran array\t: ");
        int panjang = scan.nextInt();

        // deklarasi
        int[] arrayNilai = new int[panjang];
        int nilai;

        for (int i= 0; i<arrayNilai.length; i++){
            System.out.print("Masukan Data\t : ");
            arrayNilai[i] = scan.nextInt();
        }
        for (int  a : arrayNilai) {
            if (a <=10) {
                System.out.println(a);
            }
        }

    }
}
