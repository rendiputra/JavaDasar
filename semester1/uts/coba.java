package uts;

import java.util.Scanner;

class coba{

    public static void main (String[] args)
    {
        System.out.println("=====> Kasir BetaApril <=====\n");

        Scanner scan1 = new Scanner(System.in);

        System.out.print("Masukan id Produk \t\t\t: ");
        int produk = scan1.nextInt();

        app(produk);

    }

    public static void app(int produk){
        String[][] cokelat = {
                {"Bengbeng", "6000"},
                {"Silverqueen", "15000"},
                {"Dairy Milk", "14000"},
                {"Chocolatos", "3000"},
                {"Chunky bar", "17000"},
                {"Dove", "11000"},
                {"Kit Kat", "10000"}
        };


        Scanner scan1 = new Scanner(System.in);
        int pilih = produk - 1;
        int harga = Integer.parseInt(cokelat[pilih][1]);

        System.out.println("Nama Produk : " + cokelat[pilih][0]);
        System.out.println("Harga : " + harga);

        System.out.print("Masukan jumlah : ");
        int jumlah = scan1.nextInt();


        switch (produk){
            case 1:
                if (jumlah > 10) {
                    double diskon = (harga * jumlah) * 0.5;
                    double total = (harga * jumlah) - diskon;

                    System.out.println("Harga : " + harga + " x " + jumlah);
                    System.out.println("Diskon : 5%");
                    System.out.println("Total : " + total);
                }else{
                    double total = harga * jumlah;

                    System.out.println("Harga : " + harga + " x " + jumlah);
                    System.out.println("Diskon : 0%");
                    System.out.println("Total : " + total);
                }
                break;
            case 2:
                if (jumlah > 5) {
                    double diskon = (harga * jumlah) * 10;
                    double total = (harga * jumlah) - diskon;

                    System.out.println("Harga : " + harga + " x " + jumlah);
                    System.out.println("Diskon : 10%");
                    System.out.println("Total : " + total);
                }else{
                    double total = harga * jumlah;

                    System.out.println("Harga : " + harga + " x " + jumlah);
                    System.out.println("Diskon : 0%");
                    System.out.println("Total : " + total);
                }
                break;
            case 3:
                if (jumlah > 5) {
                    double diskon = (harga * jumlah) * 0.10;
                    double total = (harga * jumlah) - diskon;

                    System.out.println("Harga : " + harga + " x " + jumlah);
                    System.out.println("Diskon : 10%");
                    System.out.println("Total : " + total);
                }else{
                    double total = harga * jumlah;

                    System.out.println("Harga : " + harga + " x " + jumlah);
                    System.out.println("Diskon : 0%");
                    System.out.println("Total : " + total);
                }
                break;
            case 4:
                if (jumlah > 10) {
                    double diskon = (harga * jumlah) * 0.05;
                    double total = (harga * jumlah) - diskon;

                    System.out.println("Harga : " + harga + " x " + jumlah);
                    System.out.println("Diskon : 10%");
                    System.out.println("Total : " + total);
                }else{
                    double total = harga * jumlah;

                    System.out.println("Harga : " + harga + " x " + jumlah);
                    System.out.println("Diskon : 0%");
                    System.out.println("Total : " + total);
                }
                break;
            case 5:
                if (jumlah > 5) {
                    double diskon = (harga * jumlah) * 0.10;
                    double total = (harga * jumlah) - diskon;

                    System.out.println("Harga : " + harga + " x " + jumlah);
                    System.out.println("Diskon : 10%");
                    System.out.println("Total : " + total);
                }else{
                    double total = harga * jumlah;

                    System.out.println("Harga : " + harga + " x " + jumlah);
                    System.out.println("Diskon : 0%");
                    System.out.println("Total : " + total);
                }
                break;
            case 6:
                if (jumlah > 5 ) {
                    double diskon = (harga * jumlah) * 0.10;
                    double total = (harga * jumlah) - diskon;

                    System.out.println("Harga : " + harga + " x " + jumlah);
                    System.out.println("Diskon : 10%");
                    System.out.println("Total : " + total);
                }else{
                    double total = harga * jumlah;

                    System.out.println("Harga : " + harga + " x " + jumlah);
                    System.out.println("Diskon : 0%");
                    System.out.println("Total : " + total);
                }
                break;
            case 7:
                if (jumlah > 5) {
                    double diskon = (harga * jumlah) * 0.10;
                    double total = (harga * jumlah) - diskon;

                    System.out.println("Harga : " + harga + " x " + jumlah);
                    System.out.println("Diskon : 10%");
                    System.out.println("Total : " + total);
                }else{
                    double total = harga * jumlah;

                    System.out.println("Harga : " + harga + " x " + jumlah);
                    System.out.println("Diskon : 0%");
                    System.out.println("Total : " + total);
                }
                break;
            default:
                System.out.println("\nMaaf data yang diinputkan salah\n");
        }

    }
}