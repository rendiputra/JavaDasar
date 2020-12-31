package sorting;

import java.util.Scanner;

public class InsertionSort {
    // yang ascending
    public  static void insertionAsc(int array[]){

        int temp;

        for (int i = 0; i < array.length; i++){
            int j = i;
            // perulangan untuk membadingkan
            // untuk perulangan && perbandingan nilai
            while (j > 0 && array[j-1] > array[j]){
                temp = array[j-1];
                array[j-1] = array[j];
                array[j] = temp;
                j--;
            }
        }
        printArray(array);
    }

    public  static void insertionDesc(int array[]){

        int temp;

        for (int i = 0; i < array.length; i++){
            int j = i;
            // perulangan untuk membadingkan
            // untuk perulangan && perbandingan nilai
            while (j > 0 && array[j-1] < array[j]){
                temp = array[j-1];
                array[j-1] = array[j];
                array[j] = temp;
                j--;
            }
        }
        printArray(array);
    }

    public static void printArray(int array[]) {
        for (int i = 0; i < array.length; i++){
            System.out.println("Indeks ke-"+ i+ "   :"+ array[i]);
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukan total angka   : ");
        int total = scan.nextInt();

        int array[] = new int[total];

        for (int i = 0; i < total; i++){
            System.out.print("Masukan angka ke-"+ i+ "\t");
            array[i] = scan.nextInt();
        }

        // Peengurutan
        System.out.println("Angka yang sudah diurutkan:");
        insertionDesc(array);
        insertionAsc(array);
    }
}
