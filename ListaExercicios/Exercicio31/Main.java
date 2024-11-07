/**********************************************************************************************************
 Escrever um programa que leia um conjunto de números positivos, e exiba se o número lido é par ou ímpar. Exiba
 ao final a soma total dos números pares lidos e também a soma dos números ímpares lidos.
 ***********************************************************************************************************/
package ListaExercicios.Exercicio31;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int quantidade;

        Scanner input = new Scanner(System.in);

        System.out.print("Digite a quantidade de números que quer digitar: ");
        quantidade = input.nextInt();

        int[] numeros = new int[quantidade];
        int[] pares = new int[quantidade];
        int[] impares = new int[quantidade];

        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite o número: ");
            numeros[i] = input.nextInt();
            if (numeros [i] % 2 == 0) {
                pares[i] = numeros[i];
                System.out.println("Número par");
            } else {
                impares[i] = numeros[i];
                System.out.println("Número ímpar");
            }
        }

        System.out.println("Soma dos números pares: " + somaPares(pares));
        System.out.println("Soma dos números ímpares: " + somaImpares(impares));
    }

    public static int somaPares(int[] pares) {
        int soma = 0;
        for (int i = 0; i < pares.length; i++) {
            soma += pares[i];
        }
        return soma;
    }

    public static int somaImpares(int[] impares) {
        int soma = 0;
        for (int i = 0; i < impares.length; i++) {
            soma += impares[i];
        }
        return soma;
    }
}