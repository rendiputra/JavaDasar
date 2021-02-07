package method;

public class funsi_persegi {
    public static void main(String[] args) {
        int sisi     = 4,
            luas     = keliling_persegi(sisi),
            keliling = luas_persegi(sisi)
        ;

        System.out.println("Keliling    : " + keliling);
        System.out.println("Luas        : " + luas);
        System.out.println("--------------------------");

        // memanggil luasDanKelilingPersegi
        luasDanKelilingPersegi(4);
    }

    // Method Procedure
    static int keliling_persegi(int sisi){
        return 4 * sisi;
    }
    static int luas_persegi(int sisi){
        return sisi * sisi;
    }

    // Method menggunakan void(Function)
    static void luasDanKelilingPersegi (int sisi) {
        int luas = sisi * sisi;
        int keliling = 4 * sisi;

        System.out.println("Keliling Persegi    : " +keliling);
        System.out.println("Luas Persegi        : " +luas);
    }

}
