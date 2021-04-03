package modul8;

import java.util.Scanner;

public class no3 {
    public static void sort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        printArray(arr);
    }
    public static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if(i != n-1)
            {
                System.out.print(arr[i] + ", ");
            }
            else{
                System.out.print(arr[i]);
            }
        }
        System.out.println();
    }
    public static int binary(int arr[], int x)
    {
        int left = 0, right = arr.length -1;
        while(left <= right)
        {
            int mid = left + (right - left) / 2;
            if(arr[mid] == x)
            {
                return mid;
            }
            else if(arr[mid] < x)
            {
                left = mid + 1;
            }
            else
            {
                right = mid - 1;
            }
        }
        return 404;
    }

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
        for (int i = 0; i < array.length; i++){
            System.out.println("Indeks ke-"+ i+ "   :"+ array[i]);
        }
    }

    public static void search(int arr[], int x)
    {
        int result = binary(arr, x);
        if(result ==  404)
        {
            System.out.println("Data " + x + " not found");
        }
        else
        {
            System.out.println("Data " + x + " found at index " + result);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[] = {21, 61, 28, 72, 44, 68, 37, 52, 75, 71,98};
        bubbleSortAsc(arr);
        for (int i = 0; i < arr.length; i++) {
            if(i<(arr.length-1))
            {
                System.out.print(arr[i] + ", ");
            }
            else
            {
                System.out.print(arr[i]);
            }
        }
        System.out.print("\nMasukkan angka yang akan dicari: ");
        int x = scanner.nextInt();
        search(arr, x);
    }
}
