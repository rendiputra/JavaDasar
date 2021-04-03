package perulangan;

import java.util.Scanner; // import library scanner

public class soal2 { // membuat class soal2
    public static void main(String[] args) { // function main (utama)
        Scanner scan = new Scanner(System.in); // membuat Scanner baru dengan nama scan
        System.out.print("Masukan bilangan        : "); // output string
        int hasil = 1, // membuat variabel hasil dengan tipe data integer
                bil = scan.nextInt(); // membuat variabel bil lalu mengambil inputan user dengan scan
        System.out.print("Masukan pencacah        : "); // output string
        int pangkat = scan.nextInt(); // membuat variable pangkat lalu mengambil inputan user dengan scan

        for (int i = 1; i <=pangkat; i++){ // perulangan for dengan batasnya adalah variable pangkat
            hasil  *= bil; // perhitungan aritmatika hasil = hasil X bil
        }
        System.out.println("Hasil pangkat adalah    : " + hasil); // menyetak hasil
    }
}
