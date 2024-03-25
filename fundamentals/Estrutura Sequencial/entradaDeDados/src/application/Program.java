package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws Exception {
       
        //* Scanner - Entrada de Dados */
        Scanner sc = new Scanner(System.in); 
        Locale.setDefault(Locale.US);
               
        //* Para ler uma palavra (texto sem espaços) */
        String x;
        x = sc.next();
        System.out.println("Você digitou: " + x);
        //* Para ler numero com ponto flutuante */
        double y;
        y = sc.nextDouble();
        System.out.printf("Você digitou: %.3f%n", y);
        //* Para ler caractere (charAt indica a posição do caractere) */
        char z;
        z = sc.next().charAt(0);
        System.out.println("Você digitou: " + z);
         
        //* Para ler vários dados na mesma linha */
        String a;
        int b;
        double c;
        
        a = sc.next();
        b = sc.nextInt();
        c = sc.nextDouble();
        
        System.out.println("Dados digitados: ");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
 
        
        int g;
        String s1, s2, s3;

        g = sc.nextInt();
        sc.nextLine();          //* Corrigir problema de consumo e quebra de linha */
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println(g);
        
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        
        sc.close(); 
    }
}
