package kuis;

import java.util.Scanner;

public class soal1 {
    public static void main(String[] args) {
        int bil, angka, ganjil = 0,
                 genap = 0;
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukan bilangan: ");
        bil = scan.nextInt();

        for (int i= 1; i<=bil; i++){
            if (i%2==0){
                genap++;
            } else {
                ganjil++;
            }
        }
        System.out.println(bil + " memiliki " + genap + " bilangan genap dan " + ganjil + " bilangan ganjil");
    }
}
