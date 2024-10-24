/**********************************************************************************************************
 Escrever um programa que leia dois números inteiros e mostre todos os relacionamentos de ordem existentes
 entre eles. Os relacionamentos possíveis são: Igual, Não igual, Maior, Menor, Maior ou igual, Menor ou igual.
 ***********************************************************************************************************/
package ListaExercicios.Exercicio10;

import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero1, numero2;

        System.out.print("Digite o primeiro número inteiro: ");
        numero1 = input.nextInt();
        System.out.print("Digite o segundo número inteiro: ");
        numero2 = input.nextInt();

        System.out.println(numero1 + " = " + numero2 + " -> " +(numero1 == numero2));
        System.out.println(numero1 + " != " + numero2 + " -> " + (numero1 != numero2));
        System.out.println(numero1 + " > " + numero2 + " -> " + (numero1 > numero2));
        System.out.println(numero1 + " < " + numero2 + " -> " + (numero1 < numero2));
        System.out.println(numero1 + " >= " + numero2 + " -> " + (numero1 >= numero2));
        System.out.println(numero1 + " <= " + numero2 + " -> " + (numero1 <= numero2));
    }
}
