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
        lingkaran(r); // memanggil method lingkaran()
    }

    // Method Procedure
    static void lingkaran(double r){
        double luas = 3.14159265358979 * r * r; // rumus luas = phi x r^2
        double keliling = 2 * 3.14159265358979 * r; // rumus keliling = phi x r x 2 atau phi * d
        System.out.println("Keliling Lingkaran : " + keliling); // mencetak output Keliling Lingkaran dengan variabel "Keliling"
        System.out.println("Luas Lingkaran      : " + luas); // mencetak output Luas Lingkaran dengan variabel "Keliling"
    }
}
