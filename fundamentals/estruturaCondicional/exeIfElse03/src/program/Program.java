package program;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);
        Locale.setDefault(Locale.US);

        int A, B;

        A = sc.nextInt();
        B = sc.nextInt();

        if (B % A == 0 || A % B == 0) {
            System.out.println("São multiplos");
        }
        else{
            System.out.println("Não são multiplos");
        }


        sc.close();
    }
}
