package entities;

public class Rectangle {
         
    public double width;
    public double height;

    public double area(){
        double a = width * height;
        return a;
    }

    public double perimeter(){
        double p = (width + height) * 2;
        return p;
    }

    public double diagonal(){
        double d = (width * width) + (height * height);
        return Math.sqrt(d);
    }   
}
/*
Não precisa declarar variavel em algumas ocasiões
 * public double area(){
        return = width * height;
    }

    public double perimeter(){
        return (width + height) * 2;        
    }
    public double diagonal(){
        return Math.sqrt((width * width) + (height * height));
 */