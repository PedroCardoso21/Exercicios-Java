package Exercicio20.dominio;

import java.util.Scanner;

public class Tabuada {
    private final int multiplicando;
    private int multiplicador = 1;

    Scanner input = new Scanner(System.in);

    public Tabuada() {
        System.out.print("Digite um número para fazer a tabuada: ");
        multiplicando = input.nextInt();
        System.out.println("Tabuada de " + multiplicando);
        while (multiplicador <= 10) {
            int produto = multiplicando * multiplicador;
            System.out.println(multiplicando + " x " + multiplicador + " = " + produto);
            multiplicador++;
        }
    }
}
