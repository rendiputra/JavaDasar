package method;

import java.util.Scanner;

public class MethodProsedur2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner scanNumber = new Scanner(System.in);

        System.out.print("Masukan Nama      : ");
        String nama = scan.nextLine();

        System.out.print("Masukan Umur      : ");
        int umur = scanNumber.nextInt();

        System.out.print("Masukan Tinggi    : ");
        Double tinggi = scanNumber.nextDouble();

        System.out.print("Lajang            : ");
        boolean status = scanNumber.nextBoolean();


        gabungan(nama, umur, tinggi, status);
    }

    static void gabungan(String nama, int umur, double tinggi, boolean status){
//        String hasil = "Nama : " + nama + ", Umur : " + umur + ", Tinggi  :" + tinggi + ", Status : " + status;

        System.out.println("Nama    : "+nama);
        System.out.println("Umur    : "+umur);
        System.out.println("Tinggi  : "+tinggi);
        System.out.println("Status  : "+status);
    }
}
