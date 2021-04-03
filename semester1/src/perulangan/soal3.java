package perulangan;
import java.util.Scanner; //Import library Scanner
public class soal3 { //membuat class soal3
    public static void main(String[] args) {    // fungtion main(utama)
        Scanner scan = new Scanner (System.in); // membuat scanner baru dengan nama scan
        System.out.print("Masukan Bilangan Bulat Pertama    :") ; //output string
        int a = scan.nextInt(); //inisialisasi variabel a dengan library scanner
        System.out.print("Masukan Bilangan Bulat Kedua      :") ; //output string
        int b = scan.nextInt(); //inisialisasi variabel b dengan library scanner
        int jml = 0; // inisialisasi variabel jml
        // melakukan perulangan yang mana pembatasnya adalah variabel b
        for(int x=1;x<=b;x++) {
            jml = (jml + a); // menjumlahkan varibel a yang nantinya akan dicek dengan mod variabel b

//            mengecek apakah variabel jml sudah ada persekutuan dengan
//            varibel b?
            if(jml % b==0) {
                System.out.println("KPK :" + jml); //menyetak hasil kpk
                break; //menyetop perulangan
            }
        }
    }
}
