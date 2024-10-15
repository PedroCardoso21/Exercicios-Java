/************************************************************************************************************
 Ler quatro valores numéricos inteiros e apresentar o resultado dois a dois da adição e multiplicação entre os
 valores lidos, baseando-se na utilização do conceito de propriedade distributiva. Dica: se forem lidas as variáveis
 A, B, C e D, devem ser somados e multiplicados os valores de A com B, A com C e A com D; depois B com C, B
 com D e por último C com D. Note que para cada operação serão utilizadas seis combinações. Assim sendo,
 devem ser realizadas doze operações de processamento, sendo seis para as adições e seis para as
 multiplicações.
 ***********************************************************************************************************/
package ListaExercicios.Exercicio4;

import java.util.Scanner;

public class Valores {
    public static void main(String[] args) {
        int[] numeros = new int[4];

        Scanner input =  new Scanner(System.in);
        Calculos calculos = new Calculos();

        System.out.println("Digite os valores de A, B, C e D, respectivamente: ");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = input.nextInt();
        }
        System.out.println("A = " + numeros[0]);
        System.out.println("B = " + numeros[1]);
        System.out.println("C = " + numeros[2]);
        System.out.println("D = " + numeros[3]);
        calculos.somas(numeros);
        calculos.multiplicacoes(numeros);
    }
}
