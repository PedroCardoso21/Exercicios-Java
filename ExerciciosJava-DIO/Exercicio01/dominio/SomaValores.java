package Exercicio01.dominio;

import java.util.Scanner;

public class SomaValores implements InterfaceSomaValores{
    private final double A;
    private final double B;
    private final double C;

    Scanner input =  new Scanner(System.in);

    public SomaValores() {
        System.out.print("Digite o valor de A: ");
        A = input.nextDouble();
        System.out.print("Digite o valor de B: ");
        B = input.nextDouble();
        System.out.print("Digite o valor de C: ");
        C = input.nextDouble();
        input.close();
    }

    @Override
    public double soma() {
        return A + B;
    }

    @Override
    public boolean verificaMenorQueC() {
        return soma() < C;
    }

    public void imprime() {
        if(verificaMenorQueC()) {
            System.out.println("A soma de A e B é menor que C");
        } else {
            System.out.println("A soma de A e B não é menor que C");
        }
    }
}
