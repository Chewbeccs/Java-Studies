package program;
public class Program {
    public static void main(String[] args) throws Exception {
       double price = 400.00;            //A Inicialização da variavel é a atribuição do seu valor
       double discount;

       if (price < 200.00) {                //toda variavel dentro de uma estrutura fazem parte daquele escopo
        discount = price * 0.1;
       } else{
        discount = 0;
       }

       System.out.println(discount);
    }
}
