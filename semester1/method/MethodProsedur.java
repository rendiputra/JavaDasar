package method;

import java.util.Scanner;

public class MethodProsedur {
    public static void main(String[] args) {

        fungsiKuadrat(3, 4);

        Scanner scan = new Scanner(System.in);
        System.out.println("Masukan nilai X : ");
        int x = scan.nextInt();
        System.out.println("Masukan nilai Y : ");
        int y = scan.nextInt();

        fungsiKuadrat(x,y);

    }

    static  void fungsiKuadrat(int x, int y){
        // int x = 3 , y = 4;
        int hasil = (x*x) + (y*y);

        System.out.println("Nilai x nya "+x);
        System.out.println("Nilai y nya "+y);
        System.out.println("Hasil Fungsi kuadratnya adalah "+ hasil);

    }

}
