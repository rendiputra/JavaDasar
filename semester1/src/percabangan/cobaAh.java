package percabangan;

import java.util.Scanner;

public class cobaAh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input jumlah user : ");
        int peserta = input.nextInt();

        String[][] user = new String[peserta][2];

        // proses registrasi
        for (int i = 0; i < user.length; ++i){
            System.out.println("\nREGISTRASI ke-"+(i+1));
            for(int j = 0; j < user[i].length; ++j) {
                if (j==0){
                    System.out.print("Masukan username  : ");
                    user[i][j] = input.next();
                }else if (j==1){
                    System.out.print("Masukan password  : ");
                    user[i][j] = input.next();
                }else{
                    continue;
                }
            }
        }

        String[][] cekUser = new String[peserta][3];

        // proses login
        for (int i = 0; i < cekUser.length; ++i){
            System.out.println("\nLogin ke-"+(i+1));
            for(int j = 0; j < cekUser[i].length; ++j) {
                if (j==0){
                    System.out.print("Username  : ");
                    cekUser[i][j] = input.next();
                }else if (j==1){
                    System.out.print("Password  : ");
                    cekUser[i][j] = input.next();
                }else if( j==2){
//                    System.out.println(cekUser[i][(j-2)] + " | " + user[i][(j-2)] );
//                    System.out.println(cekUser[i][(j-1)] + " | " + user[i][(j-1)] );
                    if (cekUser[i][(j-2)].equals(user[i][(j-2)]) && cekUser[i][(j-1)].equals(user[i][(j-1)])){
                        System.out.println("Anda berhasil login!");
                    }else {
                        System.out.println("Username & Password yang anda masukan salah !");
                    }
                } else {
                    continue;
                }

            }

        }


    }
}
