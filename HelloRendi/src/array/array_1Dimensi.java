package array;

public class array_1Dimensi {
    public static void main(String[] args) {
        String[] Buah = new String[]{
                "apel", "jeruk"
        };
        int a=0;
        for (String i : Buah) {
            a++;
            System.out.println("Index ke-"+a+" adalah "+i);
        }
    }
}
