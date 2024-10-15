package Exercicio22.dominio;

import java.util.Scanner;

public class Divisao implements InterfaceDivisao {
    private final int valorA;
    private final int valorB;

    Scanner input = new Scanner(System.in);

    public Divisao() {
        System.out.print("Digite um valor inteiro para A: ");
        valorA = input.nextInt();
        System.out.print("Digite um valor inteiro para B: ");
        valorB = input.nextInt();
        input.close();
    }

    @Override
    public int quociente() {
        return valorA / valorB;
    }

    @Override
    public int resto() {
        return valorA % valorB;
    }

    @Override
    public String toString() {
        return "Divisao{" +
                "quociente=" + quociente() +
                ", resto=" + resto() +
                '}';
    }
}
