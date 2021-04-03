package kuis;

import java.util.Scanner;

public class soal5 {
    public static void main(String[] args) {
        int bil = 1;
        Scanner scan = new Scanner(System.in);

        while (bil != 0){
            System.out.print("Masukan bilangan: ");
            bil = scan.nextInt();
        }
        System.out.println("Bye :(");
    }
}
