package program;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int senha =  0;

        while (senha != 2002) {
            senha = sc.nextInt();
            System.out.println("Senha inválida");
        }

        System.out.println("Acesso permitido");

        sc.close();
    }
}
