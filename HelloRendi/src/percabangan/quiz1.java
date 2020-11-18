package percabangan;

import java.util.Scanner;

public class quiz1 {
    public static void main(String[] args) {
        int suhu;

        Scanner scan = new Scanner( (System.in));
        System.out.println("Masukan suhu air: ");
        suhu = scan.nextInt();

        if(suhu<0){
            System.out.println("air berbentuk padat(es)");
        } else if(suhu>0 && suhu < 100){
            System.out.println("air berbentuk cair");
        } else {
            System.out.println("air berbentuk gas");
        }
    }
}
