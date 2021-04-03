package perulangan;

import java.util.Scanner;

public class quiz3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan bilangan        : ");
        int hasil = 1,
                bil = scan.nextInt();
        System.out.print("Masukan pencacah        : ");
        int pangkat = scan.nextInt();

        for (int i = 1; i <=pangkat; i++){
            hasil  *= bil;
        }
        System.out.println("Hasil pangkat adalah    : " + hasil);
    }
}
