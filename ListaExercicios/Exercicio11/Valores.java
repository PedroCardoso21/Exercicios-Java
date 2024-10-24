/**********************************************************************************************************
 Ler dois valores inteiros para as variáveis A e B, efetuar a troca dos valores de modo que a variável A passe a
 possuir o valor da variável B, e a variável B passe a possuir o valor da variável A. Apresentar os valores trocados
 ***********************************************************************************************************/
package ListaExercicios.Exercicio11;

import java.util.Scanner;

public class Valores {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        int A, B, C;

        System.out.print("Digite o valor inteiro de A: ");
        A = input.nextInt();
        System.out.print("Digite o valor inteiro de B: ");
        B = input.nextInt();

        System.out.println("Valor de A: " + A);
        System.out.println("Valor de B: " + B);
        System.out.println("Valor após a troca");
        C = A;
        A = B;
        B = C;
        System.out.println("Valor de A: " + A);
        System.out.println("Valor de B: " + B);
    }
}
