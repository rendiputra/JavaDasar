package postest;
/*
            POSTTEST ALPRO

    Nama    : Rendi Putra Pradana
    NIM     : 20104079
    Kelas   : SE-04-C
    Matkul  : Praktikum Alpro
 */

import java.util.Scanner;

public class Kasir_BetaApril {
    public static void main(String[] args) {
        int menu = tampilMenu();
        System.out.println("\n===> " + menu);
        transaksi(menu);
    }

    static int tampilMenu(){
        Scanner scan = new Scanner(System.in);
        int menu;
        System.out.print(
            "===> Kasir BetaApril <===\n" +
            "\nDaftar menu makanan:\n" +
            "1. Bengbeng\n" +
            "2. Silverqueen\n" +
            "3. Dairy Milk\n" +
            "4. Chocolatos\n" +
            "5. Chunky bar\n" +
            "6. Dove\n" +
            "7. Kit Kat\n" +
            "Masukan id produk : "
        );
        menu = scan.nextInt();

        return menu; // mengembalikan method tampilMenu() dengan variable menu
    }

    static void transaksi(int menu){
        Scanner scan = new Scanner(System.in);
        double  biaya, Diskon, diskon;
        int jumlah, harga;
        String namaProduk;

        //menghitung biaya sewa kendaraan
        switch (menu){
            case 1:
                harga = 6000;
                namaProduk = "Bengbeng";
                Diskon = 0.05;
                System.out.println("Nama Produk: " + namaProduk);
                System.out.println("Harga sewa perhari: " + harga);
                System.out.print("Masukan jumlah: ");
                jumlah = scan.nextInt();
                if (jumlah >10){
                    diskon = harga * jumlah * Diskon;
                    biaya = (harga * jumlah) - diskon;
                } else {
                    biaya = harga * jumlah;
                }

                rekapTransaksi(namaProduk, harga, jumlah, Diskon, biaya); // Struk
                break;

            case 2:
                harga = 15000;
                namaProduk = "Silverqueen";
                Diskon = 0.1;
                System.out.println("Nama Produk: " + namaProduk);
                System.out.println("Harga sewa perhari: " + harga);
                System.out.print("Masukan jumlah: ");
                jumlah = scan.nextInt();
                if (jumlah >5){
                    diskon = harga * jumlah * Diskon;
                    biaya = (harga * jumlah) - diskon;
                } else {
                    biaya = harga * jumlah;
                }

                rekapTransaksi(namaProduk, harga, jumlah, Diskon, biaya); // Struk
                break;

            case 3:
                harga = 14000;
                namaProduk = "Dairy Milk";
                Diskon = 0.1;
                System.out.println("Nama Produk: " + namaProduk);
                System.out.println("Harga sewa perhari: " + harga);
                System.out.print("Masukan jumlah: ");
                jumlah = scan.nextInt();
                if (jumlah >5){
                    diskon = harga * jumlah * Diskon;
                    biaya = (harga * jumlah) - diskon;
                } else {
                    biaya = harga * jumlah;
                }

                rekapTransaksi(namaProduk, harga, jumlah, Diskon, biaya); // Struk
                break;

            case 4:
                harga = 3000;
                namaProduk = "Chocolatos";
                Diskon = 0.05;
                System.out.println("Nama Produk: " + namaProduk);
                System.out.println("Harga sewa perhari: " + harga);
                System.out.print("Masukan jumlah: ");
                jumlah = scan.nextInt();
                if (jumlah >10){
                    diskon = harga * jumlah * Diskon;
                    biaya = (harga * jumlah) - diskon;
                } else {
                    biaya = harga * jumlah;
                }

                rekapTransaksi(namaProduk, harga, jumlah, Diskon, biaya); // Struk
                break;

            case 5:
                harga = 17000;
                namaProduk = "Chunky bar";
                Diskon = 0.1;
                System.out.println("Nama Produk: " + namaProduk);
                System.out.println("Harga sewa perhari: " + harga);
                System.out.print("Masukan jumlah: ");
                jumlah = scan.nextInt();
                if (jumlah >5){
                    diskon = harga * jumlah * Diskon;
                    biaya = (harga * jumlah) - diskon;
                } else {
                    biaya = harga * jumlah;
                }

                rekapTransaksi(namaProduk, harga, jumlah, Diskon, biaya); // Struk
                break;

            case 6:
                harga = 11000;
                namaProduk = "Dove";
                Diskon = 0.1;
                System.out.println("Nama Produk: " + namaProduk);
                System.out.println("Harga sewa perhari: " + harga);
                System.out.print("Masukan jumlah: ");
                jumlah = scan.nextInt();
                if (jumlah >5){
                    diskon = harga * jumlah * Diskon;
                    biaya = (harga * jumlah) - diskon;
                } else {
                    biaya = harga * jumlah;
                }

                rekapTransaksi(namaProduk, harga, jumlah, Diskon, biaya); // Struk
                break;

            case 7:
                harga = 10000;
                namaProduk = "Kit Kat";
                Diskon = 0.1;
                System.out.println("Nama Produk: " + namaProduk);
                System.out.println("Harga sewa perhari: " + harga);
                System.out.print("Masukan jumlah: ");
                jumlah = scan.nextInt();
                if (jumlah >5){
                    diskon = harga * jumlah * Diskon;
                    biaya = (harga * jumlah) - diskon;
                } else {
                    biaya = harga * jumlah;
                }

                rekapTransaksi(namaProduk, harga, jumlah, Diskon, biaya); // Struk
                break;
            default:
                break;
        }
    }

    static void rekapTransaksi(String namaProduk, int harga, int jumlah, double Diskon, double biaya){
        System.out.println(
            "\n\n===> Nota Kasir BetaApril <===\n" +
            "==> Produk" + "\n" +
            "> " + namaProduk + "\n" +
            "Harga\t> Rp. " + harga + " x " + jumlah + "\n" +
            "Diskon\t> " + (Diskon * 100) + "%" + "\n" +
            "Total\t> Rp. " + biaya
        );
    }

}
