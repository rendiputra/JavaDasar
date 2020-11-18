package perulangan;

import java.util.Scanner;

public class for_ {
    public static void main(String[] args) {
//        mencetak statment menggunakan looping

        System.out.println("Masukan loop akhir : ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        for (int i = a; i <=5; i++){
            System.out.println(i +"  ");
        }


    }
}
