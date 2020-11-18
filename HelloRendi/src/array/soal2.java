package array;

import java.util.Scanner;

public class soal2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukan jumlah mata kuliah : ");
        int jmlMatkul = scan.nextInt();
        System.out.print("\n");
        int[] nilai = new int[jmlMatkul];
        int jmlNilai = 0, rerata = 0, cek=0;

        for (int i= 0; i<nilai.length; i++){
            System.out.print("Masukkan nilai mata kuliah ke-" +(i + 1 )+ " : ");
            nilai[i] = scan.nextInt();
            if (nilai[i]>= 0 && nilai[i] <= 100){
                jmlNilai +=  nilai[i];
                cek++;
            }else {
                System.out.println("Nilai Tidak Valid");
                break;
            }
        }


        if (cek == jmlMatkul){

            rerata = jmlNilai / jmlMatkul;
            if (rerata >= 90 && rerata <100){
                System.out.println("\nHasil Predikat A dengan nilai : "+ rerata);
            }else if (rerata >= 70 && rerata <90) {
                System.out.println("\nHasil Predikat B dengan nilai : " + rerata);
            }else if (rerata >= 50 && rerata <70) {
                System.out.println("\nHasil Predikat C dengan nilai : " + rerata);
            }else if (rerata >= 30 && rerata <50) {
                System.out.println("\nHasil Predikat D dengan nilai : " + rerata);
            }else if (rerata >= 0 && rerata <30) {
                System.out.println("\nHasil Predikat E dengan nilai : " + rerata);
            }else{
                System.out.println("\nNilai Tidak Valid");
            }

            for (int i= 0; i<nilai.length; i++){
                System.out.println("Mata Kuliah ke-" +(i + 1 )+ "   : " +nilai[i]);
            }
        }

    }
}
