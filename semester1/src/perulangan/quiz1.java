package perulangan;

import java.util.Scanner;

public class quiz1 {
    public static void main(String[] args) {
        int fak = 1;
        String msg ;
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan bilangan yang akan dihitung : ");
        int a = scan.nextInt();
        msg = a+" != ";
        for (int i = 1; i <= a; i++){
            fak = fak * i;
            msg = msg +"  x " +  i;

//            System.out.println(msg);
        }
        System.out.println(msg);
        System.out.println("hasil faktorial adalah " + fak);
    }
}
