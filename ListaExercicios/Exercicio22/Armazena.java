/**********************************************************************************************************
 Faça um programa que leia um número. Se positivo armazene-o em A, se for negativo, em B. No final mostrar o
 resultado.
 ***********************************************************************************************************/
package ListaExercicios.Exercicio22;

import java.util.Scanner;

public class Armazena {
    public static void main(String[] args) {
        float valor, a, b;

        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        valor = input.nextFloat();

        if (valor > 0) {
            a = valor;
            System.out.println("O valor está armazenado em A pois é positivo -> " + a);
        } else {
            b = valor;
            System.out.println("O valor está armazenado em B pois não é positivo -> " + b);
        }
    }
}
