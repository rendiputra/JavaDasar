package method;
/*
    Nama    : Rendi Putra Pradana
    NIM     : 20104079
    Kelas   : SE04C
 */
import java.util.Scanner;

public class soal3 {
    public static void main(String[] args) { // Function "main()"
        char lagi;
        Scanner scanner = new Scanner(System.in);
        // perintah do while() loop berfungsi untuk mengulang perintah
        do {
            int menu = tampilMenu();
            hitung(menu); // memanggil function hitung()
            System.out.print("Apakah ingin mengulang perhitungan ? ('Y'/'N') : ");
            lagi = scanner.next().toUpperCase().charAt(0);
        }while (lagi == 'Y');
    }

    // method tampilMenu() berfungsi untuk mengurangi pengulangan code(Redurence) dan bersifat reusable
    static int tampilMenu(){
        System.out.print("\t\tKALKULATOR\n"+
            "1. Penjumlahan\n"+
            "2. Pengurangan\n"+
            "3. Perkalian\n"+
            "4. Pembagian\n"+
            "5. Pangkat\n"+
            "Masukan Menu pilihan (1-5) : "
        );
        Scanner scan = new Scanner(System.in);
        int menu = scan.nextInt();
        return menu;
    }

     // method "scann1()" berfungsi untuk mengurangi pengulangan code(Redurence) dan bersifat reusable
    static double scann1(){
        Scanner scan = new Scanner(System.in);
        double nilai1 = 0;
        System.out.print("Bilangan Pertama      : ");
        nilai1 = scan.nextDouble();
        return nilai1;
    }

    // method "scann2()" berfungsi untuk mengurangi pengulangan code(Redurence) dan bersifat reusable
    static double scann2(int menu){
        Scanner scan = new Scanner(System.in);
        double  nilai2 = 0;
        if (menu == 5){
            System.out.print("Bilangan pencacah     : ");
        }else{
            System.out.print("Bilangan Kedua     : ");
        }
        nilai2 = scan.nextDouble();
        return nilai2;
    }

    // method "hitung()" berfungsi untuk mengurangi pengulangan code(Redurence) dan bersifat reusable
    static void hitung(int menu) { // Function hitung()
        double hasil = 1, // inisialsasi variable bertipe data double
                nilai1 = scann1(), //memanggil mehtod scann1()
                nilai2 = scann2(menu); //memanggil mehtod scann2() dan membawa parameter menu
        // statment if berfungsi sebagai pemilah operator sesuai input menu
        if (menu == 1){
            hasil = nilai1 + nilai2;
            System.out.println("Hasilnya adalah: "+ hasil);
        }else if(menu == 2){
            hasil = nilai1 - nilai2;
            System.out.println("Hasilnya adalah: "+ hasil);
        } else if(menu == 3){
            hasil = nilai1 * nilai2;
            System.out.println("Hasilnya adalah: "+ hasil);
        } else if(menu == 4){
            hasil = nilai1 / nilai2;
            System.out.println("Hasilnya adalah: "+ hasil);
        } else if (menu == 5){
            for (int i = 1; i <=nilai2; i++){ // perintah for() loop berguna untuk mencari nilai pangkat
                hasil  *= nilai1; // perhitungan aritmatika hasil = hasil X bil
            }
            System.out.println("Hasilnya adalah: "+ hasil);
        }else {
            System.out.println("Silahkan masukan angka menu 1-5");
        }
    }
}
