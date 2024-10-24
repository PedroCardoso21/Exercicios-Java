/**********************************************************************************************************
 Escreva um programa que leia um número inteiro e exiba o seu módulo.
 O módulo de um número x é:
 x se x é maior ou igual a zero
 x * (-1) se x é menor que zero
 ***********************************************************************************************************/
package ListaExercicios.Exercicio12;

import java.util.Scanner;

public class Modulo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero, modulo;

        System.out.print("Digite um número inteiro: ");
        numero = input.nextInt();

        if (numero >= 0) {
            modulo = numero;
        } else {
            modulo = numero * -1;
        }

        System.out.println("Módulo do número: " + modulo);
    }
}
