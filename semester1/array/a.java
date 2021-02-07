package array;

import java.util.Scanner;

public class a {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arrayNilai = new int[7];
        for (int i= 0; i<arrayNilai.length ; i++){
            arrayNilai[i] = i;
            System.out.println(arrayNilai[i]);
        }
    }
}
