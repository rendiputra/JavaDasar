package searching;

import java.util.Scanner;

public class soal3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[] = {21, 61, 28, 72, 44, 68, 37, 52, 75, 71,98};

        // print array sebelum disorting
        System.out.println("Bilangan sebelum disorting: ");
        printArray(arr);

        // print array sebelum disorting
        System.out.println("\n\nBilangan sesudah disorting: ");
        bubbleSortAsc(arr);

        System.out.print("\nMasukkan angka yang akan dicari: ");
        int x = scanner.nextInt();
        // memanggil method search()
        search(arr, x);
    }

    public static int binary(int arr[], int x)
    {
        int left = 0, right = arr.length -1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(arr[mid] == x){
                return mid;
            }else if(arr[mid] < x){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        // return sesuatu untuk menandakan tidak ditemukannya nilai "x"
        return -404;
    }

    // berfungsi untak mencari nilai x dan indeks-nya
    public static void search(int arr[], int x)
    {
        int result = binary(arr, x);
        if(result ==  -404)
        {
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

    public static void printArray(int array[])
    {
        for (int i = 0; i < array.length; i++){
            System.out.println("Indeks ke-"+ i+ "   :"+ array[i]);
        }
    }
}
