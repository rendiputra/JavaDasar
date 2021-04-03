/*
Soal: Buatlah deret bilangan prima (angka 1-100) !
 */

public class deret_bilangan_prima {
    public static void main(String[] args) {
        int hasilBagi;


        for(int i = 1; i<=100; i++) {           // mencari bilangan prima(didalam range)
            hasilBagi = 0;                      // reset hasil perhitungan
            for(int j = 1; j <= i; j++){        // melakukan loop untuk melakukan perhitungan
                if (i % j == 0 && i != 1){      // melakukan perhitungan
                    hasilBagi++;                // apabila hasil perhitungan terpenuhi maka melakukan kalkulasi
                }
            }
            if (hasilBagi == 2) {               // jika hasil perhitungan hanya ada 2 maka bisa dipastikan itu adalah bilangan prima
                System.out.println("ini adalah bilangan prima : " + i);  // melakukan print output console
            }
        }
    }
}
