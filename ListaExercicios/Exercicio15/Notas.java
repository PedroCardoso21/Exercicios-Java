/**********************************************************************************************************
 Escreva um programa que leia quatro notas escolares de um aluno e apresentar uma mensagem que o aluno foi
 aprovado se o valor da média escolar for maior ou igual a 7. Se o valor da média for menor que 7, solicitar a nota
 do recuperação, somar com o valor da média e obter a nova média. Se a nova média for maior ou igual a 7,
 apresentar uma mensagem informando que o aluno foi aprovado na recuperação. Se o aluno não foi aprovado,
 apresentar uma mensagem informando esta condição. Apresentar junto com as mensagens o valor da média do
 aluno.
 ***********************************************************************************************************/
package ListaExercicios.Exercicio15;

import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double nota1, nota2, nota3, nota4;

        System.out.print("Digite a primeira nota: ");
        nota1 = input.nextDouble();
        System.out.print("Digite a segunda nota: ");
        nota2 = input.nextDouble();
        System.out.print("Digite a terceira nota: ");
        nota3 = input.nextDouble();
        System.out.print("Digite a quarta nota: ");
        nota4 = input.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        if (media >= 7) {
            System.out.println("Média do Aluno: " + media);
            System.out.println("Aluno aprovado!!");
        } else {
            double notaRecuperacao;
            System.out.println("Média do Aluno: " + media);
            System.out.println("Você está de recuperação!!");
            System.out.print("Digite a nota que tirou na recuperação: ");
            notaRecuperacao = input.nextDouble();
            media = (notaRecuperacao + media) / 2;
            if (media >= 7) {
                System.out.println("Média do Aluno após recuperação: " + media);
                System.out.println("Aluno aprovado!!");
            } else {
                System.out.println("Média do Aluno após recuperação: " + media);
                System.out.println("Aluno reprovado!!");
            }
        }
    }
}
