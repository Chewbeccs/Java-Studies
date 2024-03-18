package program;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

            Triangle x, y;
            x = new Triangle();
            y = new Triangle();

            System.out.println("Enter the measures of triangle x: ");
            x.a = sc.nextDouble();
            x.b = sc.nextDouble();
            x.c = sc.nextDouble();

            System.out.println("Enter the measures of triangle y: ");
            y.a = sc.nextDouble();
            y.b = sc.nextDouble();
            y.c = sc.nextDouble();

            double p = (x.a + x.b + x.c) / 2.0;
            double areaX = x.area();


            double areaY = y.area();

            System.out.printf("Triangle X area: %.4f%n", areaX);
            System.out.printf("Triangle X area: %.4f%n", areaY);

            if (areaX > areaY) {
                System.out.println("Larger area: X");                
            } else {
                System.out.println("Larger area: Y");
            }

        sc.close();
    }
}
