import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double pi = 3.14159;
        double raio;      
        
        System.out.println("Digite o valor do raio: ");
        raio = sc.nextDouble();
        
        double area = pi * (raio * raio);
        System.out.printf("A área tem valor: %.4f", area);


        sc.close();
    }
}
