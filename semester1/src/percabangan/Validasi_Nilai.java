package percabangan;
// import library scanner
import java.util.Scanner;
public class Validasi_Nilai {
    public static void main(String[] args) {
//        Inisialisasi  variabel kedalam tipe data double(bilangan desimal/real)
        double bil1, bil2, hasil;
//        inisialisasi scan kedalam Scanner
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan bilangan yang akan dibagi :");
//        input scan kedalam variabel bil1 lalu diproses menjadi tipe data Double(bilangan desimal)
        bil1 = scan.nextDouble();
        System.out.print("Masukan bilangan pembagi :");
//        input scan kedalam variabel bil2 lalu diproses menjadi tipe data Double(bilangan desimal)
        bil2 = scan.nextDouble();

//        Ini termasuk dalam percabangan 2 kondisi karena mempunyai dua pengkodisian yaitu if() dan else
        if(bil2 == 0){
            System.out.println("Pembagi tidak boleh nol('0')");
        } else {
//            bil1 / bil2 = hasil
//            ex: 10 / 2 = 5.0
            hasil = bil1/bil2;
            System.out.println("Hasil operasi perhitungan adalah: "+hasil);
        }
    }
}
