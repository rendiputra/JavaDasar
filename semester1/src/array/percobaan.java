package array;
import java.util.Scanner;
public class percobaan {
    public static void main(String[] args) {
//        int[] namaArray = new int[]{
//                1,2,3,4,5,6
//        };
//
//        long[] arrayLong = {
//                10, 20 , 30
//        };
//
//        System.out.println(namaArray.length);

        /*
        String [][] members = {
            {"asd", "asd"}, {"qwe", "qwe"},
        };

        System.out.println(members[1][2]);



         */

        // membuat array buah-buahan
        String[] buah = new String[5];

        // membuat scanner
        Scanner scan = new Scanner(System.in);

        // mengisi data ke array
        for( int i = 0; i < buah.length; i++ ){
            System.out.print("Buah ke-" + i + ": ");
            buah[i] = scan.nextLine();
        }

        System.out.println("---------------------------");

        // menampilkan semua isi array
        for( String b : buah ){
            System.out.println(b);
        }
    }
}
