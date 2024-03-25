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


        /*Ler a condição do If para entender.
        Se a hora inicial for menor que a hora final (dentro das 24h)
        ou seja ex: inicio ás 2h e fim às 18, dentro das 24h vc calcula o maior
        menos o menor*/
        if (inicio < fim) {         
            total = fim - inicio;                       
        }
         /*Ler a condição do If para entender.
        Se a hora inicial for maior que a hora final (dentro das 24h)
        ou seja ex: inicio ás 12h e fim às 5, dentro das 24h vc calcula o horario de inicio
        - às 24h (ficaria no formato de horas 12h) e com o resultado soma com o horario final*/
        else{
            total = 48 - inicio + fim;           
        }
        
        System.out.println("O jogo durou " + total + " hora(s)");
        
        sc.close();
    }
}
