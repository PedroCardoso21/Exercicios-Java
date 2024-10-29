/**********************************************************************************************************
 Escreva um programa que exiba as seguintes opções e realize os que se pede em cada uma delas:
 1 – Adição
 2 – Subtração
 3 – Multiplicação
 4 – Divisão
 ***********************************************************************************************************/
package ListaExercicios.Exercicio23;

import java.util.Scanner;

public class Matematica {
    public static void main(String[] args) {
        byte opcao;
        double n1, n2;

        Scanner input = new Scanner(System.in);

        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.print("Digite uma opção: ");
        opcao = input.nextByte();
        System.out.println("Digite os valores: ");
        System.out.print("Valor 1 -> ");
        n1 = input.nextDouble();
        System.out.print("Valor 2 -> ");
        n2 = input.nextDouble();

        switch(opcao) {
            case 1:
                adicao(n1, n2);
                break;
            case 2:
                subtracao(n1, n2);
                break;
            case 3:
                multiplicacao(n1, n2);
                break;
            case 4:
                divisao(n1, n2);
                break;
            default:
                System.out.println("Opção inválida");
        }
    }

    public static void adicao(double n1, double n2) {
        System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
    }

    public static void subtracao(double n1, double n2) {
        System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
    }

    public static void multiplicacao(double n1, double n2) {
        System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
    }

    public static void divisao(double n1, double n2) {
        System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
    }
}
