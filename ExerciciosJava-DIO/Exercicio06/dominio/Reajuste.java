package Exercicio06.dominio;

import java.util.Scanner;

public class Reajuste {
    private double valor;
    private double reajuste;

    Scanner input = new Scanner(System.in);

    public Reajuste() {
        System.out.print("Digite um valor: ");
        valor = input.nextDouble();
        reajuste = valor * 1.05;
        input.close();
    }

    @Override
    public String toString() {
        return "Reajuste{" +
                "valor=" + valor +
                ", valor com reajuste=" + reajuste +
                '}';
    }
}
