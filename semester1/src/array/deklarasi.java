package array;

import java.util.Scanner;

public class deklarasi {
    public static void main(String[] args) {
        int[] namaArray = new int[]{
                1,2,3,4,5,6
        };

        long[] arrayLong = {
                10, 20 , 30
        };

        System.out.println(namaArray.length);

        String [][] members = {
            {"asd", "asd"}, {"qwe", "qwe"},
        };

        // eksploit value array 2 dimensi
        for (int i= 0; i<members.length; i++){
            for(int j = 0; j < members[i].length; j++)
            System.out.print("Data\t :" + members[i][j]);
        }


        char[] arrayChar;
        double[] arrayDouble;
        arrayDouble = new double[10];

        int[] bilangan = new int[20];

        Scanner scan = new Scanner(System.in);
        int panjangNilai = scan.nextInt();
        bilangan = new int[panjangNilai];

        String [] arrayString = {"nyong", "Aku", "Saya"};
        System.out.println(members[1][2]);
    }
}
