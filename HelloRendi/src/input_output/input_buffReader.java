package input_output;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class input_buffReader {
    public static void main(String[] args) throws IOException {
//          BufferedReader NAMA_VARIABBLE = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader buffReader = new BufferedReader(new InputStreamReader(System.in));

//        VARIABLE
        int angka; //   bil bulat
        String  kata, kalimat, paragaf; //      tipe data utk karakter

//        input data
        System.out.print("INPUT ANGKA \n: ");
//        Parse STRING to INTEGER
        angka = Integer.parseInt(buffReader.readLine());
        System.out.println("ANGKANYA ADALAH: "+angka+"\n");


        System.out.print("INPUT KATA : ");
        kata = buffReader.readLine();
        System.out.println("KATANYA ADALAH: "+kata+"\n");

        System.out.print("INPUT kalimat : ");
        kalimat = buffReader.readLine();
        System.out.println("KATANYA ADALAH: "+kalimat+"\n");
    }
}
