package array;

import java.util.Scanner;

public class soal1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukan baris matriks : ");
        int baris = scan.nextInt();

        System.out.print("Masukan kolom matriks : ");
        int kolom = scan.nextInt();

        int[][] matriks1 = new int[baris][kolom];
        System.out.println("\n\nMatriks 1");
        for (int i = 0; i < matriks1.length; ++i){
            for(int j = 0; j < matriks1[i].length; ++j) {
                System.out.print("Masukkan baris ke-"+i+" kolom ke-"+j+" : ");
                matriks1[i][j] = scan.nextInt();
            }
        }


        int[][] matriks2 = new int[baris][kolom];
        System.out.println("\nMatriks 2");
        for (int i = 0; i < matriks2.length; ++i){
            for(int j = 0; j < matriks2[i].length; ++j) {
                System.out.print("Masukkan baris ke-"+i+" kolom ke-"+j+" : ");
                matriks2[i][j] = scan.nextInt();
            }
        }


        int[][] matriksPenjumlahan = new int[baris][kolom];
        System.out.println("\n Matriks  Penjumlahan");
        for (int i = 0; i < matriksPenjumlahan.length; ++i){
            for(int j = 0; j < matriksPenjumlahan[i].length; ++j) {
                matriksPenjumlahan[i][j] = matriks1[i][j] + matriks2[i][j];
                System.out.print("| " + matriksPenjumlahan[i][j] + " | \t");
            }
            System.out.println("\n");
        }


    }
}
