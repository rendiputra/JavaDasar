package percabangan;

import java.util.Scanner;

public class mba_mas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char mahasiswa, status;
        System.out.print("Mahasiswa ITTP? (Y/T): ");
        mahasiswa = scanner.next().charAt(0);
        System.out.print("Sudah lulus? (Y/N): ");
        status = scanner.next().charAt(0);

        if(mahasiswa == 'Y')
        {
            if(status == 'Y')
            {
                System.out.println("Hallo kakak Alumni!");
            }
            else
            {
                System.out.println("Hallo kakak mahasiswa");
            }
        }
        else
        {
            System.out.println("Yok daftar ITTP");
        }
    }
}
