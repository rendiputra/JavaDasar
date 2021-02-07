package tugas_besar;

// import library Scanner
import java.util.Scanner;

public class kalkulator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // deklarasi scanner untuk angka
        Scanner scanChar = new Scanner(System.in); // deklarasi scanner untuk karakter
        double nilai1, nilai2, hasil;
        String operator;

        // Menerima inputan user dengan bantuan library scanner
        System.out.print("\nMasukan angka pertama = ");
        nilai1 = scan.nextDouble(); // nextDouble() diperuntukan untuk tipe data double

        System.out.print("Pilih operator +,-,:,x  = ");
        operator = scanChar.next(); // next() diperuntukan untuk tipe data karakter/string

        System.out.print("Masukan angka kedua     = ");
        nilai2 = scan.nextDouble() ; // nextDouble() diperuntukan untuk tipe data double

        // memanggil method hitung() dan menyimpan valuenya kedalam variable hasil
        hasil = hitung(nilai1, operator, nilai2); // memanggil parameter
        System.out.println("\nHasil perhitungan dari " +
                nilai1 + " " + operator + " " + nilai2 + " = " + hasil);
    }

    // membuat method yang berfungsi untuk menyeleksi operator berdasarkan inputan user
    static double hitung(double nilai1, String operator, double nilai2) {
        // menyeleksi operator berdasarkan value dari variable operator menggunakan switch case
        switch (operator){
            case "+":
                return nilai1 + nilai2;
            case "-":
                return nilai1 - nilai2;
            case "x":
                return  nilai1 * nilai2;
            case ":":
                return nilai1 / nilai2;
            default:
                return 0; // default value jika tidak ada kecocokan antara case diatas
        }
    }
}
