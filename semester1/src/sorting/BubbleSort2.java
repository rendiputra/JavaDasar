package sorting;

import java.util.Scanner;

public class BubbleSort2 {
    public static void bubbleSortAsc(int array[]){
        boolean sorted = false;
        int j = 0, temp;

        while (sorted == false){
            sorted = true;
            j++;
            for(int i = 0; i < array.length-j; i++){
                if(array[i] > array[i+1]){
                    temp = array[i];
                    array[i+1] = temp;
                    sorted = false;
                }
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
//        insertionDesc(array);
        bubbleSortAsc(array);
    }
}
