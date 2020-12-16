package method;
/*
    Nama    : Rendi Putra Pradana
    NIM     : 20104079
    Kelas   : SE04C
 */
import java.util.Scanner; // import library Scanner

public class soal2 { // membuat class "soal2"
    public static void main(String[] args) { // function "main" (utama)
        Scanner scan = new Scanner(System.in); //  membuat scanner baru dengan nama scan
        System.out.print("Masukan jari-jari : ");
        double r = scan.nextDouble(); // membuat variabel r lalu mengambil inputan user dengan bantuan library scanner
        double
            luas     = luas_lingakaran(r), // menginisialisasi variabel luas dengan memanggil function luas_persegi() dengan parameternya adalah variabel r
            keliling = keliling_lingakaran(r) // menginisialisasi variabel keliling dengan memanggil function keliling_persegi() dengan parameternya adalah variabel r
        ;

        System.out.println("Keliling Lingkaran : " + keliling); // mencetak output Keliling Lingkaran dengan variabel "Keliling"
        System.out.println("Luas Lingkaran      : " + luas); // mencetak output Luas Lingkaran dengan variabel "Keliling"
    }

    // Method Procedure

    // Method untuk menghitung keliling lingkaran
    static double keliling_lingakaran(double r){ // function "keliling_lingakaran()" dengan parameter variabel "r"
        return 2 * 3.14159265358979 * r; // akan mengembalikan nilai double dari hasil perhitungan rumus
    }

    // Method untuk menghitung Luas lingkaran
    static double luas_lingakaran(double r){ // function "luas_lingakaran()" dengan parameter variabel "r"
        return 3.14159265358979 * r * r; // akan mengembalikan nilai double dari hasil perhitungan rumus
    }
}
