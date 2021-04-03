package percabangan;
// import library scanner
import java.util.Scanner;
public class Vokal_Konsonan {
    public static void main(String[] args) {
//        inisialisasi huruf kedalam tipe data char
        char huruf;

//        inisialisasi scan kedalam Scanner
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan sebuah huruf:");

//        input scan kedalam variabel huruf lalu diproses menjadi Upper case dengan method
//        .toUpperCase() dan mengambil karakter yang ber index 0 dengan method .charAt()
        huruf = scan.next().toUpperCase().charAt(0);

//        Ini termasuk dalam percabangan 1 kondisi karena hanya mempunyai satu if saja
//        Notasi operator OR dalam java adalah '||' jadi kita bisa membuat kondisi apabila
//        salah satu kondisi terpenuhi maka akan membalikan boolean True
//        Sementara untuk temannya yaitu AND notasi nya adalah '&&' yang dimana harus semua
//        kondisi terpenuhi untuk mendapat nilai boolean True

        if(huruf=='A' || huruf =='I'|| huruf =='U'|| huruf =='E' || huruf =='O'){
            System.out.println(huruf + " adalah salah satu huruf vokal");
        }
    }
}
