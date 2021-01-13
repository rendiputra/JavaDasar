package searching;

import java.util.Scanner;

public class Sequential {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr =  {3, 2, 1, 5, 4};
        System.out.print("Masukan angka yang dicari: ");
        int x = scan.nextInt();
        tampilData(arr, x);
    }

    // method untuk cari data
    public static int sequential(int[] arr, int x){
        int n = arr.length;
        for (int i = 0; i < 0; i++){
            if(arr[i]==x){
                return i;
            }
        }
        return 404;
    }

    public static void tampilData(int[] arr, int x) {
        int result = sequential(arr, x);
        if (result == 404){
            System.out.println("data " +x+ " not found");
        }else{
            System.out.println("data " +x+ " found at index "+result);
        }

    }


}
