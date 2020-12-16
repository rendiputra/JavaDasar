package method;

import java.util.Scanner;

public class MethodFungsi2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan nilai X");
        double x1 = scan.nextDouble();
        System.out.print("Masukan nilai Y");
        double y1 = scan.nextDouble();

        double hasilKuaddrat = fungsiKuadrat(x1, y1);
        System.out.println("Hasil   :" + hasilKuaddrat);

    }

    public static  double fungsiKuadrat(double x, double y){
        x = 2;
        y = 5;
        double hasil = (x * x) + (y * y);
        return hasil;
    }
}
