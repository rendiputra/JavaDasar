package perulangan;
// import library scanner
import java.util.Scanner;
// membuat class "soal1"
public class soal1 {
    public static void main(String[] args) { // function main (utama)
        int total = 0; // inisialisasi variabel "total" dengan tipe data integer dengan value = 1
        String msg; // inisialisasi variabel msg dengan tipe data String
        Scanner scan = new Scanner(System.in); // membuat scanner baru dengan nama scan
        System.out.print("Masukan bilangan : ");
        int a = scan.nextInt(); // membuat variabel bil lalu mengambil inputan user dengan bantuan library scanner
        msg = " = "; // membuat string untuk menampung pesan
        for (int i = a; i >= 1; i--){ // perulangan pada for dengan struktur (inisialisasi ekspresi; kondisi loop; ekspresi penambahan)
            total = total + i; // operasi aritmatika
            if (i==1) { // pengecekan variabel untuk menampilkan pesan(msg)
                System.out.println("Total nilai = " + msg + " 1 = " + total);
            } else{ // kondisi kedua
                msg = msg + i + " + "; // membuat string untuk menampung pesan
            }
        }
    }
}
