package com.hanifz.modul8;

import java.util.Scanner;

public class no2 {
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
        return -1;
    }
    public static void search(int arr[], int x)
    {
        int result = binary(arr, x);
        if(result ==  -1)
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
        int arr[] = {12102002, 121002004, 12102001, 12102003, 12102005, 12102008, 12102007, 12102006, 12102009, 121020013, 12102010, 12102012, 12102011};
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
