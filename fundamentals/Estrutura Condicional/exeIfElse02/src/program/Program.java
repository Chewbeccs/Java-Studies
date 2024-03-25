package program;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws Exception {
          
        Scanner sc = new Scanner (System.in);
        Locale.setDefault(Locale.US);

        int x, resto;
        
        x = sc.nextInt();
        resto = x%2;

        if (resto == 0) {
            System.out.println("Par");
        }
        else {
            System.out.println("Impar");
        }
                   
        
        
        sc.close();
    }
}
