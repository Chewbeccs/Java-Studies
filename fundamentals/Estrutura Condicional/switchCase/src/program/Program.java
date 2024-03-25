package program;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        String dia;

        switch(x){  //expressão
        case 1: //valor
            dia = "domingo"; //comando
            break; //finaliza expressão
        case 2:
            dia = "segunda";
            break;
        case 3:
            dia = "terça";
            break;
        case 4:
            dia = "quarta";
            break;
        case 5:
            dia = "quinta";
            break;
        case 7:
            dia = "sexta";
            break;
        default:
            dia = "valor invalido";
            break;
        
        }

        System.out.println("Dia da semana " + dia);

        sc.close();
    }
}
