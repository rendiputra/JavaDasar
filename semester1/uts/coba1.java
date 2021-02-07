package uts;

import java.util.Scanner;

public class coba1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double nilai, total = 0 , rerata;
        System.out.print("Masukan jumlah nilai : ");
        int jumlah = scan.nextInt();

        for (int i = 1; i <=jumlah; i++){
            System.out.print("Masukan nilai ke-"+ i +"  : ");
            nilai = scan.nextDouble();
            if(nilai>=0){
                total = total + nilai;
            }else{
                i--;
            }
        }

        System.out.println("\n Total nilai  : "+total);
        rerata = total/jumlah;
        System.out.println("Rata-rata nilai : " +rerata);
    }
}
