package program;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int higher = max(a, b, c);

        showResult(higher);

        sc.close();
    }
    //criação de método que retorna o maior valer inserido
    public static int max(int x, int y, int z){
        int aux;
        if (x > y && x > z){
            aux = x;
        }
        else if (y > z){
            aux = y;
        } else {
            aux = z;
        }
        return aux;
    }
    //criação de método que imprime o valor
    public static void showResult(int value){
        System.out.println("Higher = " + value);
    }

}
