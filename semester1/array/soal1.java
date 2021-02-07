package array;

import java.util.Scanner; // import library scanner

public class soal1 { // membuat class "soal1"
    public static void main(String[] args) { // function main (utama)
        Scanner scan = new Scanner(System.in); //  membuat scanner baru dengan nama scan

        System.out.print("Masukan baris matriks : ");
        int baris = scan.nextInt(); // membuat variabel baris lalu mengambil inputan user dengan bantuan library scanner

        System.out.print("Masukan kolom matriks : ");
        int kolom = scan.nextInt(); // membuat variabel kolom lalu mengambil inputan user dengan bantuan library scanner

        int[][] matriks1 = new int[baris][kolom]; // inisialisasi variabel matriks1 dengan tipe data array multidimensi
        System.out.println("\n\nMatriks 1");
        // perulangan untuk menguraikan nilai ordo baris
        for (int i = 0; i < matriks1.length; ++i){
            // perulangan untuk menguraikan nilai ordo kolom
            for(int j = 0; j < matriks1[i].length; ++j) {
                System.out.print("Masukkan baris ke-"+i+" kolom ke-"+j+" : ");
                // memasukan nilai array dengan format matriks1[baris][kolom]
                // oleh inputan user dengan bantuan library scanner
                matriks1[i][j] = scan.nextInt();
            }
        }


        int[][] matriks2 = new int[baris][kolom]; // inisialisasi variabel matriks2 dengan tipe data array multidimensi
        System.out.println("\nMatriks 2");
        // perulangan untuk menguraikan nilai ordo baris
        for (int i = 0; i < matriks2.length; ++i){
            // perulangan untuk menguraikan nilai ordo kolom
            for(int j = 0; j < matriks2[i].length; ++j) {
                System.out.print("Masukkan baris ke-"+i+" kolom ke-"+j+" : ");
                // memasukan nilai array dengan format matriks2[baris][kolom]
                // oleh inputan user dengan bantuan library scanner
                matriks2[i][j] = scan.nextInt();
            }
        }


        int[][] matriksPenjumlahan = new int[baris][kolom]; // inisialisasi variabel matriksPenjumlahan dengan tipe data array multidimensi
        System.out.println("\n Matriks  Penjumlahan");
        // perulangan untuk menguraikan nilai ordo baris
        for (int i = 0; i < matriksPenjumlahan.length; ++i){
            // perulangan untuk menguraikan nilai ordo kolom
            for(int j = 0; j < matriksPenjumlahan[i].length; ++j) {
                // melakukan operasi aritmatika antara matrik1 dan matriks2
                matriksPenjumlahan[i][j] = matriks1[i][j] + matriks2[i][j];
                System.out.print("| " + matriksPenjumlahan[i][j] + " | \t"); // mengeluarkan nilai matriksPenjumlahan
            }
            System.out.println("\n"); // mengganti baris baru pada matriks
        }

    }
}
