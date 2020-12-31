package sorting;

import java.util.Scanner;

public class soal3 {
    public static void main(String[] args) {
        int menu, total;
        // Scanner untuk inputan user
        Scanner scan = new Scanner(System.in); // int
        Scanner scanner = new Scanner(System.in); // String
        System.out.print("masukan total buku  : ");
        total = scan.nextInt();
        String[] judulBuku = new String[total];

        // menginput judul buku kedalam array judulBuku[]
        for (int i=0; i<total; i++){
            System.out.print("Masukkan Judul Buku ke-" +i+ " : ");
            judulBuku[i] = scanner.nextLine();
        }

        System.out.println("\n<==== Urutkan ===>\n" +
            "1. Insertion Ascending (A-Z)\n" +
            "2. Insertion Descending (Z-A)"
        );
        System.out.print("Pilih: ");
        menu = scan.nextInt();

        // swicth case untuk memilih metode asc atau desc
        switch (menu){
            case 1:
                System.out.println("\nSorting Buku secara Ascending");
                insertionAsc(judulBuku);
                break;
            case 2:
                System.out.println("\nSorting Buku secara Descending");
                insertionDesc(judulBuku);
                break;
            default:
                System.out.println("Invalid Input");
        }

        // mengeluarkan judul buku dari array judulbuku[]
        for (int i = 0; i < judulBuku.length; i++) {
            System.out.println("Indeks ke-" + i + "\t: " + judulBuku[i]);
        }
    }

    public static void insertionAsc(String[] array) {
        String temp;
        //perulangan untuk check
        for (int i = 0; i < array.length; i++) {
            int j = i;
            //perulangan untuk membandingkan
            while (j > 0 && array[j - 1].compareTo(array[j]) > 0)
            {
                temp = array[j - 1];
                array[j - 1] = array[j];
                array[j] = temp;
                j--;
            }
        }
    }
    // perbedaan script antara asc dan desc ada di .compareTo(...> atau <...)
    public static void insertionDesc(String[] array) {
        String temp;
        //perulangan untuk check
        for (int i = 0; i < array.length; i++) {
            int j = i;
            //perulangan untuk membandingkan
            while (j > 0 && array[j - 1].compareTo(array[j]) > 0)
            {
                temp = array[j - 1];
                array[j - 1] = array[j];
                array[j] = temp;
                j--;
            }
        }
    }

}
