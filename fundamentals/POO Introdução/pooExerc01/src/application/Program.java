package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle rectangle = new Rectangle(); //instanciar classe

        System.out.println("Enter rectangle width and height: ");
        rectangle.width = sc.nextDouble();
        rectangle.height = sc.nextDouble();
        
        double a = rectangle.area();
        System.out.printf("Area: %.2f%n", a);

        double p = rectangle.perimeter();
        System.out.printf("Perimeter: %.2f%n", p);

        double d = rectangle.diagonal();
        System.out.printf("Diagonal: %.2f%n", d);
       
        sc.close();
    }
}
/* Não precisa fazer as declarações como variavel
System.out.printf("Area: %.2f%n", a);
System.out.printf("Perimeter: %.2f%n", p);
System.out.printf("Diagonal: %.2f%n", d); 
*/
