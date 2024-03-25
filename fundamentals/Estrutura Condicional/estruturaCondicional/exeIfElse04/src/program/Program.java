package program;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int inicio, fim, total;
        

        System.out.println("Horario de início de jogo: ");
        inicio = sc.nextInt();

        System.out.println("Horario do fim de jogo: ");
        fim = sc.nextInt();

        if (inicio < fim) {
            total = fim - inicio;                       
        }
        else{
            total = 24 - inicio + fim;           
        }
        
        System.out.println("O jogo durou " + total + " hora(s)");
        
        sc.close();
    }
}
