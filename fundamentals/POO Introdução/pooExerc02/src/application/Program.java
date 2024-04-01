package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();
        
        System.out.println("Enter the employee's name: ");
        employee.name = sc.nextLine();
              
        System.out.println("Gross Salary: ");
        employee.grossSalary = sc.nextDouble();
        
        System.out.println("Tax: ");
        employee.tax = sc.nextDouble();
            
        System.out.println(employee);
        System.out.println("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        employee.increaseSalary(percentage);

        System.out.println();
        System.out.println("Updated data: " + employee);
        
        sc.close();
    }
}
