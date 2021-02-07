// nama package
package pendaftaran;

// import library scanner
import java.util.Scanner;

// nama class
public class mahasiswa {

// function main
    public static void main(String[] args) {
//Deklarasi scanner {FORMAT (Scanner NAMA_VARIABLE = new Scanner(System.in);  )}
        Scanner namaMahasiswa = new Scanner(System.in);
        Scanner asalSekolah = new Scanner(System.in);
        Scanner rataNilai = new Scanner(System.in);
        Scanner namaProdi = new Scanner(System.in);

//Deklasi Variable {FORMAT ( TIPE_DATA NAMA_VARIABLE )}
        String nama, sekolah, prodi;
        double nilai;

//OUTPUT STRING
        System.out.println("===============PENDAFTARAN MAHASISWA BARU===============");
        System.out.println("Silahkan isi form dibawah ini untuk mendaftar:");

        System.out.print("Nama\t\t\t\t\t: ");
//Inputan namaMahasiswa menggunakan library Scanner dan disimpan nilai(STRING) nya ke dalam variable nama
        nama = namaMahasiswa.nextLine();

        System.out.print("Asal Sekolah\t\t\t: ");
//Inputan asalSekolah menggunakan library Scanner dan disimpan nilai(STRING) nya ke dalam variable sekolah
        sekolah = asalSekolah.nextLine();

        System.out.print("Rata-rata nilai smt 1-5\t: ");
//Inputan rataNilai menggunakan library Scanner dan disimpan nilai(DOUBLE/pecahan) nya ke dalam variable nilai
        nilai = rataNilai.nextDouble();

        System.out.print("Pilihan Prodi\t\t\t: ");
//Inputan namaProdi menggunakan library Scanner dan disimpan nilai(STRING) nya ke dalam variable prodi
        prodi = namaProdi.nextLine();

//Output STRING + Variable
        System.out.println("\n===============KONFIRMASI REGISTRASI===============\n");

/*
    "STRING" + 10 = "1010" DAN "STRING" + "STRING" = "STRINGSTRING"
    jadi: apabila tipe data string menggunakan operator Addition(+)
    maka akan melakukan concat(penggabungan STRING(kata))
*/
        System.out.println("Nama\t\t\t\t\t: " + nama);
// "STRING" + sekolah(Pemanggilan VARIABLE sekolah)
        System.out.println("Asal Sekolah\t\t\t: " + sekolah); //ex : "Asal Sekolah : SMK TELEKOMINKASI TELESANDI BEKASI"
        System.out.println("Rata-rata nilai smt 1-5\t: " + nilai); // ex : "Rata-rata nilai smt 1-5: 97.9"
        System.out.println("Pilihan Prodi\t\t\t: " + prodi); //ex : "Pilihan Prodi : S1 Software Enginnering
//
        System.out.println("\n"+nama+", kamu berhasil melakukan registrasi, silahkan tunggu pengumuman selanjutnya");
    }

}
