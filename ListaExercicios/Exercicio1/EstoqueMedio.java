/************************************************************************************************************
 Faça um programa para calcular o estoque médio de uma peça, sendo que:
 ESTOQUE MÉDIO = (QUANTIDADE_MÍNIMA + QUANTIDADE_MÁXIMA) /
 ***********************************************************************************************************/
package ListaExercicios.Exercicio1;

import java.util.Scanner;

public class EstoqueMedio {
    public static void main(String[] args) {
        double quantidadeMinima, quantidadeMaxima, estoqueMedio;

        Scanner input = new Scanner(System.in);

        System.out.println("Estoque Médio de uma peça");
        System.out.print("Digite a quantidade mínima da peça: ");
        quantidadeMinima = input.nextDouble();
        System.out.print("Digite a quantidade máxima da peça: ");
        quantidadeMaxima = input.nextDouble();
        estoqueMedio = (quantidadeMinima + quantidadeMaxima) / 2;
        System.out.println("O estoque médio da peça é " + estoqueMedio);
        input.close();
    }
}
