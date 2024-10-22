/**********************************************************************************************************
 Calcular e apresentar o valor do volume de uma lata de óleo, utilizando a fórmula:
 V = 3.14159 * R * R * A
 Onde as variáveis: V, R e A representam respectivamente o volume, o raio e a altura.
 ***********************************************************************************************************/
package ListaExercicios.Exercicio8;

import java.util.Scanner;

public class Volume {
    public static void main(String[] args) {
        double volume, raio, altura, PI = 3.14;
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o raio da lata: ");
        raio = input.nextDouble();
        System.out.print("Digite o altura da lata: ");
        altura = input.nextDouble();

        volume = (PI * raio * 2 * altura);
        System.out.println("O volume da lata é: " + volume);
    }
}
