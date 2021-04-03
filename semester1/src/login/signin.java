package login;
import java.util.Scanner;

public class signin {
    public static void main(String[] args) {
        int notelp, pin;
        System.out.print("Silahkan masukan notelp: ");
        Scanner user = new Scanner(System.in);
        notelp = user.nextInt();

        System.out.print("Silahkan masukan password: ");
        Scanner pw = new Scanner(System.in);
        pin = pw.nextInt();

        System.out.println(user);
        System.out.println(pw);
        System.out.println(notelp);
        System.out.println(pin);

        if (notelp == 123 || pin == 12345){
            System.out.println("Username dan password benar ");
        } else {
            System.out.println("Username dan password salah");
        }

    }
}
