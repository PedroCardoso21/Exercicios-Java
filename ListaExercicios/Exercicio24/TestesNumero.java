/**********************************************************************************************************
Escreva um programa que leia dois números inteiros e apresente as opções para usuário escolher o que deseja
 realizar:
 1 – Verificar se um dos números lidos é ou não múltiplo do outro
 2 – Verificar se os dois números lidos são pares
 3 – Verificar se a média dos dois números é maior ou igual a 7.
 4 – Sair
 ***********************************************************************************************************/
package ListaExercicios.Exercicio24;

import java.util.Scanner;

public class TestesNumero {
    public static void main(String[] args) {
        byte opcao;
        int n1, n2, maiorValor, menorValor;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite dois valores inteiros:");
        System.out.print("-> ");
        n1 = input.nextInt();
        System.out.print("-> ");
        n2 = input.nextInt();

        if (n1 > n2) {
            maiorValor = n1;
        } else {
            maiorValor = n2;
        }

        if (n1 < n2) {
            menorValor = n1;
        } else {
            menorValor = n2;
        }

        System.out.println("Escolha uma opção: ");
        System.out.println("1 – Verificar se um dos números lidos é ou não múltiplo do outro");
        System.out.println("2 - Verificar se os dois números lidos são pares");
        System.out.println("3 - Verificar se a média dos dois números é maior ou igual a 7");
        System.out.println("4 - Sair");
        System.out.print("-> ");
        opcao = input.nextByte();

        switch(opcao) {
            case 1:
                if (isMultiplo(n1, n2)) {
                    System.out.println(maiorValor + " é múltimplo de " + menorValor);
                    break;
                } else {
                    System.out.println(maiorValor + " não é múltiplo de " + menorValor);
                    break;
                }
            case 2:
                if (arePar(n1, n2)) {
                    System.out.println("Os números são pares");
                    break;
                } else {
                    System.out.println("Os números não são pares");
                    break;
                }
            case 3:
                if (isMaiorOuIgual7(n1, n2)) {
                    System.out.println("A média dos dois números é maior que 7");
                    break;
                } else {
                    System.out.println("A médiad dos dois números não é maior que 7");
                    break;
                }
            case 4:
                System.out.println("Programa encerrado");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }

    public static boolean isMultiplo(int n1, int n2) {
        return n1 % n2 == 0 || n2 % n1 == 0;
    }

    public static boolean arePar(int n1, int n2) {
        return n1 % 2 == 0 && n2 % 2 == 0;
    }

    public static boolean isMaiorOuIgual7(int n1, int n2) {
        return (n1 + n2) / 2 > 7;
    }
}
