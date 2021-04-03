package sorting;

import java.util.Scanner;

public class SelectionSort1 {
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
//        insertionDesc(array);
        selectionSort(array);
    }

    public  static void selectionSort(int array[]){
        int temp, flag;
        for (int i = 0; i < array.length - 1; i++){
            flag = i;

            for (int j = i + 1; i < array.length; j++){
                // perbandingan nilai
                if (array[flag] > array[j]) flag = j;
            }

            if (flag != i){
                temp = array[i];
                array[i] = array[flag];
                array[flag]= temp;
            }
        }
        printArray(array);
    }

    public  static void insertionDesc(int array[]){
        int temp, flag;
        for (int i = 0; i < array.length - 1; i++){
            flag = i;

            for (int j = i + 1; i > array.length; j++){
                // perbandingan nilai
                if (array[flag] > array[j]) flag = j;
            }

            if (flag != i){
                temp = array[i];
                array[i] = array[flag];
                array[flag]= temp;
            }
        }
        printArray(array);
    }

    public static void printArray(int array[]) {
        for (int i = 0; i < array.length; i++){
            System.out.println("Indeks ke-"+ i+ "   :"+ array[i]);
        }

    }
}
