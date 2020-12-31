package sorting;

public class BubbleSort {
    public static void bubbleSort(int[] angka){
        for (int i = 0; i < angka.length; i++){
            for( int j=0; j < angka.length-1; j++){
                if (angka[j]>angka[j+1]){
                    int sementara = angka[j];
                    angka[j] = angka[j+1];
                    angka[j+1] = sementara;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] angka = {9, 7, 8, 6, 10, 5, 5, 4};

        System.out.println("\nAngka sebelum diurutkan:");
        for (int i = 0; i < angka.length; i++){
            System.out.print(angka[i]+ ",  ");
        }

        System.out.println("\nAngka sudah diurutkan:");
        bubbleSort(angka);
        for (int i = 0; i < angka.length; i++){
            System.out.print(angka[i]+ ",  ");
        }
    }
}
