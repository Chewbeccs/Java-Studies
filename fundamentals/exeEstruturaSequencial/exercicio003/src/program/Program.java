package program;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int funcionario;
        int horasTrabalhadas;
        double valorHora;
        double salario;

        System.out.println("Digite o numero do funcionário: ");
        funcionario = sc.nextInt();
        System.out.println("Informe as horas trabalhadas: ");
        horasTrabalhadas = sc.nextInt();
        System.out.println("Informe valor da remuneração por horas: ");
        valorHora = sc.nextDouble();

        salario = valorHora * horasTrabalhadas;
        System.out.printf("O salário do funcionario numero %d será: %.2f", funcionario, salario);


        sc.close();
    }
}
