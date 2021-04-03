package percabangan;
// import library scanner
import java.util.Scanner;
public class Biaya_Operasi {
    public static void main(String[] args) {
//        Inisialisasi  variabel kedalam tipe data integer(bilangan bulat)
        int menu,jenis;
//      insialisasi library scanner kedalam variabel scan
        Scanner scan = new Scanner(System.in);

        System.out.println("<-- Menu Hitung Biaya Operasi -->\n" +
                "1. Hitung Biaya Operasi Mata\n" +
                "2. Hitung Biaya Operasi Jantung");
        System.out.print("Masukan pilihan : ");
//        input scan kedalam variabel menu lalu diproses menjadi tipe data Integer(bilangan bulat)
        menu = scan.nextInt();

//        Ini termasuk dalam percabangan 3 kondisi karena mempunyai tiga pengkodisian
//        yaitu if(), else if(), dan else
        if (menu == 1){
            System.out.println("JENIS PENYAKIT MATA :\n" +
                    "1. Katarak\n" +
                    "2. Plus/Minus\n" +
                    "3. Silinder");
            System.out.print("Masukan jenis penyakit mata : ");
//        input scan kedalam variabel jenis lalu diproses menjadi tipe data Integer(bilangan bulat)
            jenis = scan.nextInt();
//            Implementasi Switch Case
            switch (jenis) {
                case 1:
                    System.out.println("Biaya operasi katarak = Rp. 7.500.000");
                    break;
                case 2:
                    System.out.println("Biaya operasi Plus / Slinder = Rp. 5.000.000");
                    break;
                case 3:
                    System.out.println("Biaya operasi Silinder = Rp. 4.000.000");
                    break;
//              apabila semua pengkondisian tidak terpenuhi maka fungsi default akan ter eksekusi
                default:
                    System.out.println("Silahkan masukan nomor jenis penyakit dengan benar");
            }

        } else if (menu == 2){
            System.out.println("JENIS PENYAKIT JANTUNG :\n" +
                    "1. Jantung koroner\n" +
                    "2. Katup Jantung\n" +
                    "3. Otot Jantung");
            System.out.print("Masukan jenis penyakit jantung : ");
//        input scan kedalam variabel jenis lalu diproses menjadi tipe data Integer(bilangan bulat)
            jenis = scan.nextInt();
//            Implementasi Switch Case
            switch (jenis) {
                case 1:
                    System.out.println("Biaya operasi Jantung Koroner Rp. 500.000.000");
                    break;
                case 2:
                    System.out.println("Biaya operasi Katup Jantung = 350.000.000");
                    break;
                case 3:
                    System.out.println("Biaya operasi Otot Jantung = Rp.450.000.000");
                    break;
//              apabila semua pengkondisian tidak terpenuhi maka fungsi default akan ter eksekusi
                default:
                    System.out.println("Silahkan masukan nomor jenis penyakit dengan benar");
            }

        } else {
            System.out.println("Silahkan masukan nomor menu dengan benar");
        }

    }
}
