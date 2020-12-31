package sorting;

public class soal1 {
    public static void main(String[] args) {
        // membuat array untuk penampung nilai ips
        double ips[]= {
            3.8, 2.9, 3.3, 4.0, 2.4
        };

        System.out.println("Sebelum dilakukan sorting:");
        //mengeluarkan nilai array
        for (int i = 0; i< ips.length; i++){
            System.out.println("Indeks ke-"+ i + " : " +ips[i]);
        }

        bubbleSort(ips); // memanggil method bubbleSort() dengan membawa nilai pada variable ips

        System.out.println("\nSesudah dilakukan sorting:");
        //mengeluarkan nilai array yang sudah di sorting
        for (int i = 0; i< ips.length; i++){
            System.out.println("Indeks ke-"+ i + " : " +ips[i]);
        }
    }

    static  void bubbleSort(double[] a){
        double b = a.length;
        double temp;

        // algorithm Bubble Sorting
        for (int i = 0; i< b; i++){
            for (int j=1; j < (b-1); j++){
                if (a[j-1] < a[j]){
                    temp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

}
