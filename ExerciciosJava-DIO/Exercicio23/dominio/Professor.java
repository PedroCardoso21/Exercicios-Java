package Exercicio23.dominio;

import java.util.Scanner;

public class Professor implements InterfaceProfessor {
    private final double valorHora;
    private final int aulasLecionadas;
    private final double salarioLiquido;
    private final double salarioComDesconto;

    Scanner input = new Scanner(System.in);

    public Professor() {
        System.out.print("Digite o valor da hora de aula: ");
        valorHora = input.nextDouble();
        System.out.print("Digite a quantidade de aulas lecionadas no mês: ");
        aulasLecionadas = input.nextInt();
        input.close();
        salarioLiquido = valorHora * aulasLecionadas;
        System.out.println("Salário líquido -> " + salarioLiquido);
        System.out.println("Desconto do INSS -> " + limiteINSS());
        salarioComDesconto = salarioLiquido - limiteINSS();
        System.out.println("Salário líquido final -> " + salarioComDesconto);
    }

    @Override
    public double descontoINSS() {
        if (salarioLiquido <= 1320) {
            return salarioLiquido * 0.075;
        } else if (salarioLiquido > 1320 && salarioLiquido <= 2571.29) {
            return salarioLiquido * 0.09;
        } else if (salarioLiquido > 2571.29 && salarioLiquido <= 3856.94) {
            return salarioLiquido * 0.12;
        } else {
            return salarioLiquido * 0.14;
        }
    }

    @Override
    public double limiteINSS() {
        if (descontoINSS() > 877.63) {
            return 877.63;
        } else {
            return descontoINSS();
        }
    }
}
