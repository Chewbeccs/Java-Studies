package program;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        int codigo = sc.nextInt();
        int quantidade = sc.nextInt();
        
        if(codigo == 1){
           System.out.printf("O preço total é: %.2f",  4.00 * quantidade); 
        }
        if(codigo == 2){
           System.out.printf("O preço total é: %.2f",  4.50 * quantidade);
        }
        if(codigo == 3){
           System.out.printf("O preço total é: %.2f",  5.00 * quantidade); 
        }
        if(codigo == 4){
           System.out.printf("O preço total é: %.2f",  2.00 * quantidade);
        }
        if(codigo == 5){
           System.out.printf("O preço total é: %.2f",  1.50 * quantidade);
         }
      

        sc.close();
    }
}
