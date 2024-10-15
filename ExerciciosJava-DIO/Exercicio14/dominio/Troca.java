package Exercicio14.dominio;

import java.util.Scanner;

public class Troca implements InterfaceTroca {
    private int A;
    private int B;
    private int C;

    Scanner input = new Scanner(System.in);

    public Troca() {
        System.out.print("Digite o valor de A: ");
        A = input.nextInt();
        System.out.print("Digite o valor de B: ");
        B = input.nextInt();
        input.close();
    }

    @Override
    public void trocaDeValores() {
        C = A;
        A = B;
        B = C;
    }

    @Override
    public String toString() {
        return "Troca{" +
                "A=" + A +
                ", B=" + B +
                '}';
    }
}
