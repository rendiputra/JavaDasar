package method;
/*
    Nama    : Rendi Putra Pradana
    NIM     : 20104079
    Kelas   : SE04C
 */
import java.util.Scanner; // import library Scanner

public class soal1 {  // membuat class "soal1"

    public static void main(String[] args) {// function "main" (utama)
        int bil = inputBil(); // memanggil method ganjilGenap() dan memasukan nilai kedalam variabel bil
        ganjilGenap(bil); // memanggil method ganjilGenap()
    }

    static void ganjilGenap (int bil){  // membuat method(procedure) "ganjilGenap"
        // perintah if berfungsi untuk mencari/menseleksi nilai ganjil dan genap
        if (bil % 2 ==0){
            System.out.println("Bilangan yang anda masukan adalah Genap");
        }else  {
            System.out.println("Bilangan yang anda masukan adalah Ganjil");
        }
    }

    static int inputBil (){ // membuat method(Function) "inputBil"
        Scanner scan = new Scanner(System.in); //  membuat scanner baru dengan nama scan
        System.out.print("Masukan bilangan : ");
        int bil = scan.nextInt(); // mengambil inputan user
        return bil; // mengembalikan nilai dengan variabel bil
    }
}
