package program;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        int in = 0;         // cria-se variaveis para armazenar os tipos
        int out = 0;
        
        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            if (x >= 10 && x <=20) {
                in = in + 1;
            } else {
                out = out + 1;
            }
        }

        System.out.println(in + " in");
        System.out.println(out + " out");




        sc.close();
    }
}
