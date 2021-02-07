package kuis;

import java.util.Scanner;

public class soal6 {
    public static void main(String[] args) {
        int bil, ratusan, puluhan, satuan, sisa_bil ;
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukan bilangan: ");
        bil = scan.nextInt();

        if (bil>999){
            System.out.println("Bukan angka ratusan, puluhan, dan ribuan");
        }else {
            ratusan = bil / 100;
            sisa_bil = bil % 100;

            puluhan = sisa_bil / 10;
            sisa_bil = sisa_bil  % 10;

            satuan = sisa_bil;

            System.out.println("Memiliki "+ ratusan +" ratusan");
            System.out.println("Memiliki "+ puluhan +" puluhan");
            System.out.println("Memiliki "+ satuan +" satuan");
        }
    }
}
