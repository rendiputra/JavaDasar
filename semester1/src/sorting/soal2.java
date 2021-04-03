package sorting;

public class soal2 {
    public static void main(String[] args) {
        // membuat array untuk penampung nama anggota
        String anggota[]= {
            "Pain", "Konan", "Tobi", "Zetsu", "Sasori",
            "Hidan", "Deidara", "Kisame", "Kakuzu","Itachi"
        };
        System.out.println("Sebelum dilakukan sorting:");
        //mengeluarkan nilai array
        for (int i = 0; i< anggota.length; i++){
            System.out.println("Indeks ke-"+ i + " : " +anggota[i]);
        }

        selectionSort(anggota); // memanggil method selectionSort() dengan membawa nilai pada variable anggota

        System.out.println("\nSesudah dilakukan sorting:");
        //mengeluarkan nilai array yang sudah di sorting
        for (int i = 0; i< anggota.length; i++){
            System.out.println("Indeks ke-"+ i + " : " +anggota[i]);
        }
    }

    public static void selectionSort(String array[]){
        String temp;
        int flag;

        // algoritm Selection Sorting
        for (int i = 0; i < array.length - 1; i++) {
            flag = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[flag].compareTo (array[j]) > 0) {
                    flag = j;
                }
            }
            if (flag != i){
                temp = array[i];
                array[i] = array[flag];
                array[flag] = temp;
            }
        }
    }

}
