package searching;

import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan panjang array: ");
        int[] array =  new int[scan.nextInt()];

        for (int i = 0; i< array.length; i++ ){
            System.out.print("Masukan value index ke-"+i+ " : ");
            array[i] = scan.nextInt();
        }
        bubbleSortAsc(array);
        System.out.print("\nMasukan data yang dicari: ");
        int key = scan.nextInt();
        resultSearch(array, key);
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
    // method untuk cari data metode squential
    /*
    public static int sequential(int[] arr, int x){
        int n = arr.length;
        for (int i = 0; i < 0; i++){
            if(arr[i]==x){
                return i;
            }
        }
        return 404;
    }
    */


    // metode binary search
    public  static int binarySearch ( int[] array, int key){
        int left = 0;
        int right = array.length-1;

        while (left <= right){
            // cari nilai tengah
            int mid = left + (right - left)/2;

            if (array[mid] == key){
                return mid;
            }else if(array[mid] < key){
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }

        return 404;
    }

    public  static  void resultSearch (int[] array, int key){
        int result = binarySearch(array, key);
        if (result == 404){
            System.out.println("Data " + key + " Tidak ada..");
        }else {
            System.out.println("Data " + key + " ditemukan pada index ke-"+result);
        }
    }
}
