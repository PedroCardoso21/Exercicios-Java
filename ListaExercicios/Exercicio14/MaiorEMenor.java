/**********************************************************************************************************
 Escreva um programa que leia dois números e apresente a diferença do maior para o menor
 ***********************************************************************************************************/
package ListaExercicios.Exercicio14;

import java.util.Scanner;

public class MaiorEMenor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n1, n2;

        System.out.print("Digite o primeiro valor: ");
        n1 = input.nextDouble();
        System.out.print("Digite o segundo valor: ");
        n2 = input.nextDouble();

        if (n1 > n2) {
            double resultado = n1 - n2;
            System.out.println("Diferença do maior para o menor: " + resultado);
        } else {
            double resultado = n2 - n1;
            System.out.println("Diferença do maior para o menor: " + resultado);
        }
    }
}
