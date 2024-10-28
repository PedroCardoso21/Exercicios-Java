/**********************************************************************************************************
 Escrever um programa declarando três variáveis do tipo inteiro (a, b e c). Ler um valor maior que zero para cada
 variável (se o valor digitado não é válido, mostrar mensagem e ler novamente). Exibe o menor valor lido
 multiplicado pelo maior e o maior valor dividido pelo menor.
 ***********************************************************************************************************/
package ListaExercicios.Exercicio20;

import java.util.Scanner;

public class Valores {
    public static void main(String[] args) {
        int a, b, c;
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um valor inteiro para A: ");
        a = input.nextInt();
        if (a <= 0) {
            while (a <= 0) {
                System.out.print("Digite um valor maior que 0: ");
                a = input.nextInt();
            }
        }

        System.out.print("Digite um valor inteiro para B: ");
        b = input.nextInt();
        if (b <= 0) {
            while (b <= 0) {
                System.out.print("Digite um valor maior que 0: ");
                b = input.nextInt();
            }
        }

        System.out.print("Digite um valor inteiro para C: ");
        c = input.nextInt();
        if (c <= 0) {
            while (c <= 0) {
                System.out.print("Digite um valor maior que 0: ");
                c = input.nextInt();
            }
        }

        maiorValor(a, b, c);
        menorValor(a, b, c);
        calculo(a, b, c);
    }

    public static int maiorValor(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }

    public static int menorValor(int a, int b, int c) {
        if (a <= b && a <= c) {
            return a;
        } else if (b <= a && b <= c) {
            return b;
        } else {
            return c;
        }
    }

    public static void calculo(int a, int b, int c) {
        System.out.println("Menor Valor lido * Maior valor ido = " + menorValor(a, b, c) * maiorValor(a, b, c));
        System.out.println("Maior valor lido / menor valor = " + maiorValor(a, b, c) / menorValor(a, b, c));
    }
}
