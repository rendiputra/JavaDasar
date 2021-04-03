package data_mahasiswa;

// Import Library
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Data_Mahasiswa {
    public static void main(String[] args) throws IOException {


//    Format { BufferedReader NAMA_VARIABBLE = new BufferedReader(new InputStreamReader(System.in)); }
        BufferedReader data = new BufferedReader(new InputStreamReader(System.in));

//Deklarasi Variable
// Format (TIPE_DATA NAMA_VARIABLE = VALUE)
        String nama, TTL;
        int NIM;

//OUTPUT STRING
        System.out.println("======================DATA MAHASISWA======================");
        System.out.print("Nama\t\t: ");

//input data menggunakan BufferedReader
        nama = data.readLine(); // membaca inputan user dan menyimpan data ke variable nama
        System.out.print("NIM\t\t\t: ");

//Konversi STRING to INTEGER menggunakan method parseInt()
        NIM = Integer.parseInt(data.readLine());/*  membaca inputan dan mengkonversi data(STRING) menjadi INTEGER
                                                    dan disimpan kedalam variable NIM */

        System.out.print("TTL\t\t\t: ");
        TTL = data.readLine();// membaca inputan user dan menyimpan data ke variable TTL

/*
    "Contoh: "STRING" + 10 = "1010", DAN "STRING" + "STRING" = "STRINGSTRING"
    jadi: apabila tipe data string menggunakan operator Addition(+)
    maka akan melakukan concat(penggabungan STRING(kata))
*/
        System.out.println("\n\n======================DATA MAHASISWA======================");
        System.out.println("Nama\t\t: " + nama);
        System.out.println("NIM\t\t\t: " + NIM);
        System.out.println("TTL\t\t\t: " + TTL);
    }
}
