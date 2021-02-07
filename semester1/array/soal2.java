package array;

import java.util.Scanner; // import library scanner

public class soal2 { // membuat class "soal2"
    public static void main(String[] args) { // function main (utama)
        Scanner scan = new Scanner(System.in);  //  membuat scanner baru dengan nama scan

        System.out.print("Masukan jumlah mata kuliah : ");
        int jmlMatkul = scan.nextInt(); // membuat variabel jmlMatkul lalu mengambil inputan user dengan bantuan library scanner
        System.out.print("\n");
        // inisialisasi variabel nilai dengan tipe data array
        // dengan menentukan panjang array dengan bantuan variabel jmlMatkul
        int[] nilai = new int[jmlMatkul];
        int jmlNilai = 0, rerata = 0, cek=0; // inisialisasi variabel dengan tipe data integer

        // perulangan untuk menguraikan urutan mata kuliah
        for (int i= 0; i<nilai.length; i++){
            System.out.print("Masukkan nilai mata kuliah ke-" +(i + 1 )+ " : ");
            // memasukan nilai array dengan format nilai[indeks]
            // oleh inputan user dengan bantuan library scanner
            nilai[i] = scan.nextInt();
            // validasi untuk mengecek inputan user dengan value 1-100
            if (nilai[i]>= 0 && nilai[i] <= 100){
                jmlNilai +=  nilai[i]; // menampung jumlah nilai kedalam variabel jmlNilai
                cek++; // cek = cek + 1 : variabel cek untuk mengecek jumlah inputan samadengan jumlah matkul
            }else { // apabila inputan user diluar dari value 1-100
                System.out.println("Nilai Tidak Valid");
                break; // untuk menyetop method perulangan
            }
        }

        // validasi untuk mengecek jumlah inputan samadengan jumlah matkul
        if (cek == jmlMatkul){
            // operasi aritmatika untuk mencari rata-rata nilai
            rerata = jmlNilai / jmlMatkul;

            // method if untuk mencari predikat dari variabel rerata
            if (rerata >= 90 && rerata <100){
                System.out.println("\nHasil Predikat A dengan nilai : "+ rerata);
            }else if (rerata >= 70 && rerata <90) {
                System.out.println("\nHasil Predikat B dengan nilai : " + rerata);
            }else if (rerata >= 50 && rerata <70) {
                System.out.println("\nHasil Predikat C dengan nilai : " + rerata);
            }else if (rerata >= 30 && rerata <50) {
                System.out.println("\nHasil Predikat D dengan nilai : " + rerata);
            }else if (rerata >= 0 && rerata <30) {
                System.out.println("\nHasil Predikat E dengan nilai : " + rerata);
            }else{
                System.out.println("\nNilai Tidak Valid");
            }

            //  menguraikan array pada variabel nilai
            for (int i= 0; i<nilai.length; i++){
                // mengeluarkan nilai nilai
                System.out.println("Mata Kuliah ke-" +(i + 1 )+ "   : " +nilai[i]);
            }
        }

    }
}
