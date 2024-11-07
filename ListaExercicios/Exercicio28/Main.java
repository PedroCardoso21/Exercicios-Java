/**********************************************************************************************************
 Faça um programa que gera e escreve os números ímpares dos números lidos entre 100 e 200
 ***********************************************************************************************************/
package ListaExercicios.Exercicio28;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int quantidade;
        int valor;

        Scanner input = new Scanner(System.in);

        System.out.print("Digite quantos números você quer digitar:");
        quantidade = input.nextInt();

        int[] numeros = new int[quantidade];
        int[] impares = new int[quantidade];

        System.out.println("Digite os valores (Entre 100 e 200)");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o valor: ");
            valor = input.nextInt();
            numeros[i] = valor;
            if (numeros[i] % 2 == 1) {
                impares[i] = valor;
            }
        }

        System.out.print("Valores ímpares: ");

        for (int i : impares) {
            if (i != 0) {
                System.out.print(i + " ");
            }
        }

    }
}
