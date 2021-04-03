package method;

public class MethodReturnValue {
    public static void main(String[] args) {
        System.out.println(tambah(10,2));

        System.out.println(hitung(10, "*", 10));
    }


    // void digantikan dengan tipe data yang dibutuhkan maka akan menjadi Method Return Value
    static int tambah(int nilai1, int nilai2){
        int hasil = nilai1 + nilai2;
        return hasil;
    }

    static int hitung(int nilai1, String operator, int nilai2) {
        switch (operator){
            case "+":
                return nilai1 + nilai2;
            case "-":
                return nilai1 - nilai2;
            case "*":
                return  nilai1 * nilai2;
            case "/":
                return nilai1 / nilai2;
            default:
                return 0;
        }
    }
}
