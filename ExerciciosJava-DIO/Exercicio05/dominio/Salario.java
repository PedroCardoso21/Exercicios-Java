package Exercicio05.dominio;

import java.util.Scanner;

public class Salario implements InterfaceSalario {
    private final double salario;
    private final double salarioMinimo;

    Scanner input = new Scanner(System.in);

    public Salario() {
        System.out.print("Digite o seu salário: ");
        salario = input.nextDouble();
        System.out.print("Digite o salário mínimo: ");
        salarioMinimo = input.nextDouble();
        input.close();
    }

    @Override
    public double quantidadeSalariosMinimos() {
        return salario / salarioMinimo;
    }

    @Override
    public String toString() {
        return "Seu salário é: " + salario +
                "\nO salário mínimo é: " + salarioMinimo +
                "\nVocê ganha " + quantidadeSalariosMinimos() + " salários mínimos";
    }
}
