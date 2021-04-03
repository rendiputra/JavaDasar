package method;

import java.util.Scanner;

public class soal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan nilai Nilai ke-1   : ");
        double nilai1 = scan.nextDouble();
        System.out.print("Masukan nilai Nilai ke-2   : ");
        double nilai2 = scan.nextDouble();

        nilaiMaks(nilai1, nilai2);
    }

    static void nilaiMaks (double nilai1, double nilai2){
        if (nilai1 > nilai2){
            System.out.println("Nilai Maksimal adalah nilai ke-1 : " + nilai1);
        }else  {
            System.out.println("Nilai Maksimal adalah nilai ke-2 : " + nilai2);
        }
    }
}
