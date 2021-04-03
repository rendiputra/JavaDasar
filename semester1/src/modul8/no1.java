package com.hanifz.modul8;

import java.util.Scanner;

public class no1 {
    public static void printArray(String arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (i != n-1)
            {
                System.out.print(arr[i]+ ", ");
            }
            else
            {
                System.out.print(arr[i]);
            }
        }
        System.out.println();
    }
    static int sequential(String arr[], String x)
    {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if(x.equals(arr[i]))
            {
                return i;
            }
        }
        return -1;
    }
    static void search(String arr[], String x)
    {
        int result = sequential(arr, x);
        if(result == -1)
        {
            System.out.println("Data " + x + " not found");
        }
        else
        {
            System.out.println("Data " + x + " found at index "+ result);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String arr[] = {"R 300 SR","R 1234 DJ","R 701 LP","R 3218 RR","R 007 TU","R 3 ST","R 999 RT","R 210 RO","R 1111 II","R 4987 LH"};
        for (int i = 0; i < arr.length; i++) {
            if(i<(arr.length-1))
            {
                System.out.print("[" + arr[i] + "], ");
            }
            else
            {
                System.out.print("[" + arr[i] + "]");
            }
        }
        System.out.print("\nMasukkan angka yang akan dicari: ");
        String x = scanner.nextLine();
        search(arr, x);
    }
}
