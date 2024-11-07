/**********************************************************************************************************
 Escreva um programa que leia:
 - a quantidade de números que deverá processar;
 - os números que deverá processar,e calcule e exiba, para cada número a ser processado o seu fatorial.
 Lembrete: O fatorial de um número N é dado pela fórmula: N! = 1 * 2 * 3 * 4 * 5 * ... * N
 ***********************************************************************************************************/
package ListaExercicios.Exercicio27;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int quantidade;

        Scanner input = new Scanner(System.in);

        System.out.print("Digite a quantidade de números que quer processar: ");
        quantidade = input.nextInt();

        int[] numeros = new int[quantidade];
        System.out.println("Digite os números");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = input.nextInt();
            System.out.println("Fatorial de " + numeros[i] + " = " + fatorial(numeros[i]));
        }
    }

    public static int fatorial(int n) {
        int contador = n;

        while (contador > 1) {
            contador--;
            n *= contador;
        }
        return n;
    }
}