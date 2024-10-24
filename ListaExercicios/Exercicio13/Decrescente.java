/**********************************************************************************************************
 Escreva um programa que leia 3 números inteiros e imprima na tela os valores em ordem decrescente
 ***********************************************************************************************************/
package ListaExercicios.Exercicio13;

import java.util.Scanner;

public class Decrescente {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2, n3, maiorValor, menorValor, valorMeio;

        System.out.print("Digite o valor inteiro de n1: ");
        n1 = input.nextInt();
        System.out.print("Digite o valor inteiro de n2: ");
        n2 = input.nextInt();
        System.out.print("Digite o valor inteiro de n3: ");
        n3 = input.nextInt();

        if (n1 >= n2 && n1 >= n3) {
            maiorValor = n1;
        } else if (n2 >= n1 && n2 >= n3) {
            maiorValor = n2;
        } else {
            maiorValor = n3;
        }

        if (n1 <= n2 && n1 <= n3) {
            menorValor = n1;
        } else if (n2 <= n1 && n2 <= n3) {
            menorValor = n2;
        } else {
            menorValor = n3;
        }

        if (maiorValor != n1 && menorValor != n1) {
            valorMeio = n1;
        } else if (maiorValor != n2 && menorValor != n2) {
            valorMeio = n2;
        } else {
            valorMeio = n3;
        }

        System.out.println("Ordem Decrescente: " + maiorValor + " " + valorMeio + " " + menorValor);
    }
}
