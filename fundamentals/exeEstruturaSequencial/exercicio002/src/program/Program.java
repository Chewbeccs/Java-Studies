package program;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        int A, B, C, D;

        System.out.println("Digite um valor: ");
        A = sc.nextInt();
        System.out.println("Digite um valor: ");
        B = sc.nextInt();
        System.out.println("Digite um valor: ");
        C = sc.nextInt();
        System.out.println("Digite um valor: ");
        D = sc.nextInt();
        
        int diferenca = A*B-C*D;
        System.out.println(diferenca);


        sc.close();
    }
}
