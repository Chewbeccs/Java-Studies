package program;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);
        Locale.setDefault(Locale.US);

        int x;
        x = sc.nextInt();
        
        if (x <= -1) {
            System.out.println("Negativo");
        }
        else if (x >= 1) {
            System.out.println("Positivo");
        }
        else {
            System.out.println("Neutro");
            
        }
        
        sc.close();
    }
}
