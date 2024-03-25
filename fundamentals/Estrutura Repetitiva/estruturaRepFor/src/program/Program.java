package program;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner sc = new Scanner (System.in);

        // Quando se sabe previamente quantas vezes repetir a condição
        int n = sc.nextInt();
        int soma = 0;
        
        for (int i = 0; i<n; i++){
            int x = sc.nextInt();
            soma += x;
        }
        System.out.println("Soma: " + soma);

        sc.close();
    }
}
