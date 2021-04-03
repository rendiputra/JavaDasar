package method;

public class MethodVariableArgument {
    public static void main(String[] args) {
    int[] values = {90, 34,78,100};
    sayCongrats("Rendi", values);
    sayCongrats("Putra", 99, 98, 100, 89);

    }

    static void sayCongrats(String nama, int... values){
        int total = 0;
        for(int value : values){
            total += value;
        }
        int finalValue = total / values.length;

        if (finalValue >= 75){
            System.out.println("Selamat "+nama + ", Anda Lulus");
        }else {
            System.out.println("Maaf "+nama + ", Anda Tidak Lulus");
        }
    }
}
