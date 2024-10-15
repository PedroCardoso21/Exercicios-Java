package Exercicio13.dominio;

import java.util.Scanner;

public class Pessoa implements InterfacePessoa {
    private final String nome;
    private final int idade;

    Scanner input = new Scanner(System.in);

    public Pessoa() {
        System.out.print("Digite o seu nome: ");
        nome = input.next();
        System.out.print("Digite sua idade: ");
        idade = input.nextInt();
        input.close();
    }

    @Override
    public boolean maiorDeIdade() {
        return idade >= 18;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", maiorDeIdade=" + maiorDeIdade() +
                '}';
    }
}
