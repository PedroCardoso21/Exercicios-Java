package Exercicio08.dominio;

import java.util.Scanner;

public class TresValores implements InterfaceTresValores{
    private final int A;
    private final int B;
    private final int C;

    Scanner input =  new Scanner(System.in);

    public TresValores() {
        System.out.print("Digite o valor de A: ");
        A = input.nextInt();
        System.out.print("Digite o valor de B: ");
        B = input.nextInt();
        System.out.print("Digite o valor de C: ");
        C = input.nextInt();
        input.close();
    }

    @Override
    public int maiorValor() {
        if (A > B && A > C) {
            return A;
        } else if (B > A && B > C) {
            return B;
        } else {
            return C;
        }
    }

    @Override
    public int menorValor() {
        if (A < B && A < C) {
            return A;
        } else if (B < A && B < C) {
            return B;
        } else {
            return C;
        }
    }

    @Override
    public int valorDoMeio() {
        if (A != maiorValor() && A != menorValor()) {
            return A;
        } else if (B != maiorValor() && B != menorValor()) {
            return B;
        } else {
            return C;
        }
    }

    public void imprime() {
        System.out.println("-------------------------------------");
        System.out.println("Lista em ordem decrescente -> " + maiorValor() + " " + valorDoMeio() + " " + menorValor());
    }
}
