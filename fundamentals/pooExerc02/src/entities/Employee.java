package entities;

public class Employee {
    
    public String name;
    public double grossSalary;
    public double tax;   

    public double netSalary(){
        double net = grossSalary - tax;
        return net;
    }

    // sem esse metodo não é possivel imprimir os atributos da classe
    public String toString(){ 
        return 
        "Employee: "
        + name
        + ", $"
        + String.format("%.2f", netSalary());
    } 

   

}
