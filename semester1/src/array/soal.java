package array;

public class soal {
    public static void main(String[] args) {
        int[] NilUjian = new int[]{
                79,90,68,50,98,67
        };
        char[] Indeks = new char[NilUjian.length];

        for(int i = 0; i < NilUjian.length; i++) {
            if (NilUjian[i] >= 80 && NilUjian[i] <= 100){
                Indeks[i] = 'A';
            }else if (NilUjian[i] >= 70 && NilUjian[i] < 80){
                Indeks[i] = 'B';
            } else if (NilUjian[i] >= 55 && NilUjian[i] < 70){
                Indeks[i] = 'C';
            } else if (NilUjian[i] >= 45 && NilUjian[i] < 55){
                Indeks[i] = 'D';
            }else  if (NilUjian[i] >= 0 && NilUjian[i] < 45){
                Indeks[i] = 'E';
            }else {
                System.out.println("Invalid nilai");
            }
        }

        for(int i = 0; i < Indeks.length; i++) {
            System.out.println(NilUjian[i] + " = " + Indeks[i]);
        }
    }
}
