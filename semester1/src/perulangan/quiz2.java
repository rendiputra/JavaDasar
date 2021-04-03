package perulangan;

import java.util.Scanner;

public class quiz2 {
    public static void main(String[] args) {
        int total = 0;
        String msg;
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan bilangan : ");
        int a = scan.nextInt();
        msg = " = ";
        for (int i = a; i >= 1; i--){
            total = total + i;
            if (i==1) {
                System.out.println("Total nilai = " + msg + " 1 = " + total);
            } else{
                msg = msg + i + " + ";
            }
        }
    }
}
