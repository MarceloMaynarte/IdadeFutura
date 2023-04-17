import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner  (System.in);

        //Declaração de variaveis
        int AnoA, idadeA, AnoNasc, idadeFut;
        int AnoFut = 2050;

        System.out.println("Informe o seu ano de nascimento ");
        AnoNasc = input.nextInt();

        System.out.println("Informe o ano em que você está ");
        AnoA = input.nextInt();

        idadeA = AnoA - AnoNasc;
        System.out.println("A sua idade atua é de " + idadeA + " anos de idade");
        
        idadeFut = AnoFut - AnoNasc;

        System.out.println("Em 2050 você terá " + idadeFut + " anos de idade");
        
        
        


    }
}
