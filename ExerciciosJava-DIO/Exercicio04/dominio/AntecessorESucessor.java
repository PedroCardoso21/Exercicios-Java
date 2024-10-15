package Exercicio04.dominio;
import java.util.Scanner;

public class AntecessorESucessor implements InterfaceAntecessorESucessor {
    private final int numero;

    Scanner input =  new Scanner(System.in);

    public AntecessorESucessor() {
        System.out.print("Digite um número inteiro: ");
        numero = input.nextInt();
        input.close();
    }

    @Override
    public int antecessor(){
        return numero - 1;
    }

    @Override
    public int sucessor(){
       return numero + 1;
    }

    @Override
    public String toString() {
        return "Numero: " + numero +
                "\nSucessor: " + sucessor() +
                "\nAntecessor: " + antecessor();
    }
}
