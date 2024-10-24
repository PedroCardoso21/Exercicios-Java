/**********************************************************************************************************
 Escreva um programa que leia dois números e exiba mensagem informando o valor do maior número e o valor do
 menor número. Se os dois números forem iguais, o programa deve exibir mensagem informando este fato.
 ***********************************************************************************************************/
package ListaExercicios.Exercicio16;

import java.util.Scanner;

public class MaiorEMenor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n1, n2;

        System.out.print("Digite o valor do primeiro número: ");
        n1 = input.nextDouble();
        System.out.print("Digite o valor do segundo número: ");
        n2 = input.nextDouble();

        if (n1 > n2) {
            System.out.println("O primeiro número é maior que o segundo");
        } else if (n1 == n2) {
            System.out.println("Os valores são iguais");
        } else {
            System.out.println("O segundo número é maior que o primeiro");
        }
    }
}
