/**********************************************************************************************************
Ler uma temperatura em graus Celsius e apresentá-Ia convertida em graus Fahrenheit. A fórmula de conversão de
temperatura a ser utilizada é F = (9 * C + 160) / 5, em que a variável F representa é a temperatura em graus
Fahrenheit e a variável C representa é a temperatura em graus Celsius
***********************************************************************************************************/
package ListaExercicios.Exercicio6;

import java.util.Scanner;

public class Graus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double celsius;
        double fahrenheit;

        System.out.print("Digite a temperatura em Celsius: ");
        celsius = input.nextDouble();

        fahrenheit = (9 * celsius + 160) / 5;

        System.out.println("Temperatura em Fahrenheit: " + fahrenheit);
    }
}
