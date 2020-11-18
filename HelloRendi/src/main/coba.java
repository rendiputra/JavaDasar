package main;

import java.util.Scanner;

public class coba {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);

        System.out.print("Inputkan ukuran baris array\t: ");
        int baris = scan.nextInt();

        System.out.print("Inputkan ukuran kolom array\t: ");
        int kolom = scan.nextInt();

        int[][] arrayNilai = new int[baris][kolom];

        for (int i = 0; i < arrayNilai.length; ++i){
            for(int j = 0; j < arrayNilai[i].length; ++j) {
                System.out.print("Masukan Nilai baris ke-" + i + ", Kolom ke-"+j);
                arrayNilai[i][j] = scan.nextInt();
            }
        }

        for (int i = 0; i < arrayNilai.length; ++i){
            for(int j = 0; j < arrayNilai[i].length; ++j) {
                System.out.print("Masukan Nilai baris ke-" + i + ", Kolom ke-"+j+" =  ");
                System.out.println(arrayNilai[i][j]);
            }
        }



    }
}
