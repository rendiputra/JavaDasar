package kuis;

import java.util.Scanner;

public class soal4 {
    public static void main(String[] args) {
        int bil;
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan bilangan: ");
        bil = scan.nextInt();

        for (int i =1; i<=bil; i++){
            for (int j=1; j<=i; j++){
                System.out.print(i);
            }
        }
    }
}
