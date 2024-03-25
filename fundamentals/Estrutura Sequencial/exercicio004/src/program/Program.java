package program;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int item1, item2, unidItem1, unidItem2;
        double precoItem1, precoItem2;
        
        item1 = sc.nextInt();
        unidItem1 = sc.nextInt();
        precoItem1 = sc.nextDouble();
        System.out.printf("Item: %d // Unid: %d //Preço: %.2f", item1, unidItem1, precoItem1);

        item2 = sc.nextInt();
        unidItem2 = sc.nextInt();
        precoItem2 = sc.nextDouble();
        System.out.printf("Item: %d // Unid: %d //Preço: %.2f%n", item2, unidItem2, precoItem2);
       
        double valor = (precoItem1*unidItem1) + (precoItem2*unidItem2);
        
        System.out.printf("Valor a pagar: %.2f", valor);
        
        sc.close();
    }
}
