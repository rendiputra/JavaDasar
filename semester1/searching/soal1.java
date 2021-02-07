package searching;

import java.util.Scanner;

public class soal1 {

    // Method main()
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String arr[] = {"R 300 SR","R 1234 DJ","R 701 LP","R 3218 RR","R 007 TU","R 3 ST","R 999 RS","R 210 RO","R 1111 II","R 4987 LH"};
        // memanggil method printArray()
        printArray(arr);
        System.out.print("\nMasukkan angka yang akan dicari: ");
        String x = scanner.nextLine();
        // memanggil method search() dengan membawa data variable "arr" dan "x"
        search(arr, x);
    }

    // berfungsi untuk mencetak array
    public static void printArray(String arr[]){
        for (int i = 0; i < arr.length; i++) {
            if(i<(arr.length-1)){
                System.out.print("[" + arr[i] + "], ");
            } else{
                System.out.print("[" + arr[i] + "]");
            }
        }
    }

    // searching dengan menggunakan metode sequential
    static int sequential(String arr[], String x){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if(x.equals(arr[i])){
                return i;
            }
        }
        // return sesuatu untuk menandakan tidak ditemukannya nilai "x"
        return -404;
    }

    // berfungsi untuk mencari nilai x dan indeksnya
    static void search(String arr[], String x){
        // memanggil method sequential dan memasukan nilainya kedalam variabel result
        int result = sequential(arr, x);
        if(result == -404){
            System.out.println("Data " + x + " not found");
        } else {
            System.out.println("Data " + x + " found at index "+ result);
        }
    }
}
