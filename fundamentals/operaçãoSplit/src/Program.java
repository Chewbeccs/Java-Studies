public class Program {
    public static void main(String[] args) throws Exception {
    
    String s = "potato apple lemon";
    String[] vect = s.split(" "); /* split é uma função que recorta 
                                        uma string, nesse caso o separador
                                        é o espaço, a cada espaço é um recorte */
   
    System.out.println(vect[0]);
    System.out.println(vect[1]);
    System.out.println(vect[2]);
    System.out.println(vect[3]);

    }
}
