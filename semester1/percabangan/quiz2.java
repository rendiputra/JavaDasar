package percabangan;

import java.util.Scanner;

public class quiz2 {
    public static void main(String[] args) {
        System.out.println("--------------------------------------------------");
        System.out.println("\t\t\t\tMASUKAN DATA");
        System.out.println("--------------------------------------------------");
        int agama;
        char jk, status;
        String nama;

        Scanner scanNam = new Scanner((System.in));
        Scanner scanAgam = new Scanner((System.in));
        Scanner scanJ = new Scanner((System.in));

        System.out.print("Masukan nama: ");
        nama = scanNam.nextLine();
        System.out.print("Masukan Jenis Kelamin ('L'/'P'): ");
        jk = scanJ.next().toUpperCase().charAt(0);
        System.out.print("Status ('K'/'S'): ");
        status = scanJ.next().toUpperCase().charAt(0);
        System.out.print("Masukan Agama (1=Islam, 2=Katolik, 3=Prostesan, 4=Hindu, 5=Budha) : ");
        agama = scanAgam.nextInt();


        System.out.println("--------------------------------------------------");
        System.out.println("\t\t\t\tHASIL KELUARAN");
        System.out.println("--------------------------------------------------");
        System.out.println("Nama : " + nama);
        System.out.println("Status : " + status);
        System.out.println("Jenis Kelamin : " + jk);
        System.out.print("Agama : ");

        switch (agama) {
            case 1:
                System.out.println("Islam");
                break;
            case 2:
                System.out.println("Katolik");
                break;
            case 3:
                System.out.println("Protestan");
                break;
            case 4:
                System.out.println("Hindu");
                break;
            case 5:
                System.out.println("Budha");
                break;
            default:
                System.out.println("Silahkan masukan nomor untuk agama dengan benar");
        }
    }
}
