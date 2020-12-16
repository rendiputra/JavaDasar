package method;

public class MethodFungsi {
    public static  double fungsiKuadrat(){
        double x = 2;
        double y = 5;
        double hasil = (x * x) + (y * y);
        return hasil;
    }

    public static void main(String[] args) {
        System.out.println("Hasil   : "+fungsiKuadrat());
    }
}
