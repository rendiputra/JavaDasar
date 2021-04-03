package method;

import java.util.Scanner;

public class MethodFungsi3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner scanNumber = new Scanner(System.in);

        System.out.print("Masukan Nama : ");
        String nama = scan.nextLine();

        System.out.print("Masukan Umur : ");
        int umur = scanNumber.nextInt();

        System.out.print("Masukan Tinggi : ");
        Double tinggi = scanNumber.nextDouble();

        System.out.print("Lajang : ");
        boolean status = scanNumber.nextBoolean();

        String hasil = gabungan(nama, umur, tinggi, status);
        System.out.println(hasil);
    }

    static String gabungan(String nama, int umur, double tinggi, boolean status){
        String hasil = "Nama : " + nama + ", Umur : " + umur + ", Tinggi  :" + tinggi + ", Status : " + status;

        return hasil;
    }
}
