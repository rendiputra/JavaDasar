package searching;

import java.util.Scanner;

public class soal2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[] = {12102002, 12102004, 12102001, 12102003, 12102005, 12102008, 12102007, 12102006, 12102009, 121020013, 12102010, 12102012, 12102011};

        // print array yang belum di sorting
        System.out.println("Data NIM sebelum disorting:");
        printArray(arr);

        // Print array sesudah disorting
        bubbleSortAsc(arr);
        System.out.print("\nMasukkan angka yang akan dicari: ");

        int x = scanner.nextInt();
        // memanggil method search()
        search(arr, x);
    }

    // searching dengan metode binary
    public static int binary(int arr[], int x){
        int left = 0, right = arr.length -1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(arr[mid] == x){
                return mid;
            }else if(arr[mid] < x){
                left = mid + 1;}
            else{
                right = mid - 1;
            }
        }
        // return sesuatu untuk menandakan tidak ditemukannya nilai "x"
        return -404;
    }

    // berfungsi untak mencari nilai x dan indeks-nya
    public static void search(int arr[], int x){
        int result = binary(arr, x);
        if(result ==  -404){
            System.out.println("Data " + x + " not found");
        }else{
            System.out.println("Data " + x + " found at index " + result);
        }
    }

    // sorting dengan metode bubble sort
    public static void bubbleSortAsc(int array[]){
        for (int i = 0; i < array.length; i++){
            for( int j=0; j < array.length-1; j++){
                if (array[j]>array[j+1]){
                    int sementara = array[j];
                    array[j] = array[j+1];
                    array[j+1] = sementara;
                }
            }
        }
        // print array
        System.out.println("\nArray yang sudah diurutkan:");
        printArray(array); // memanggil method printArray()
    }

    public static void printArray(int array[]){
        for (int i = 0; i < array.length; i++){
            System.out.println("Indeks ke-"+ i+ "   :"+ array[i]);
        }
    }
}
