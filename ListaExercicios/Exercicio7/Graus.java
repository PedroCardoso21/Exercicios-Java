/**********************************************************************************************************
Ler uma temperatura em graus Fahrenheit e apresentá-Ia convertida em graus Celsius. A fórmula de conversão de
temperatura a ser utilizada é C = (F - 32) * 5 / 9, em que a variável F é a temperatura em graus Fahrenheit e a
variável C é a temperatura em graus Celsius
 ***********************************************************************************************************/
package ListaExercicios.Exercicio7;

import java.util.Scanner;

public class Graus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double celsius;
        double fahrenheit;

        System.out.print("Digite a temperatura em Fahrenheit: ");
        fahrenheit = input.nextDouble();

        celsius = (fahrenheit - 32) * 5 / 9;

        System.out.println("Temperatura em Celsius: " + celsius);
    }
}
