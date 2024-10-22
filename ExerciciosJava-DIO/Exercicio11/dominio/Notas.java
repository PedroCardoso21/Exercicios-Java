package Exercicio11.dominio;

import java.util.Scanner;

public class Notas implements InterfaceNotas {
    private final String nome;
    private final double nota1;
    private final double nota2;
    private final double nota3;
    private final double nota4;

    Scanner input =  new Scanner(System.in);

    public Notas() {
        System.out.print("Digite o seu nome: ");
        nome = input.next();
        System.out.print("Digite a primeira nota: ");
        nota1 = input.nextDouble();
        System.out.print("Digite a segunda nota: ");
        nota2 = input.nextDouble();
        System.out.print("Digite a terceira nota: ");
        nota3 = input.nextDouble();
        System.out.print("Digite a quarta nota: ");
        nota4 = input.nextDouble();
        input.close();
    }

    @Override
    public double calculaMedia() {
        return (nota1 + nota2 + nota3 + nota4) / 4;
    }

    @Override
    public boolean alunoAprovado() {
        return calculaMedia() >= 7.0;
    }

    public void imprime() {
        System.out.println("Nome do Aluno: " + nome);
        System.out.println("Média do Aluno: " + calculaMedia());
        if (alunoAprovado()) {
            System.out.println("Situação do Aluno: Aprovado!!");
        } else {
            System.out.println("Situação do Aluno: Reprovado!!");
        }
    }
}
