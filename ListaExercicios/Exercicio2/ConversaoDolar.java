/************************************************************************************************************
 Faça um programa que:
 - Leia a cotação do dólar
 - Leia um valor em dólares
 - Converta esse valor para Real
 - Mostre o resultado
 ***********************************************************************************************************/
package ListaExercicios.Exercicio2;

import java.util.Scanner;

public class ConversaoDolar {
    public static void main(String[] args) {
        double cotacaoDolar, valorDolar, valorReal;

        Scanner input = new Scanner(System.in);

        System.out.println("Conversão de Dólar para Real");
        System.out.print("Digite a cotação atual do Dólar: ");
        cotacaoDolar = input.nextDouble();
        System.out.print("Digite um valor em dólares: ");
        valorDolar = input.nextDouble();
        valorReal = valorDolar * cotacaoDolar;
        System.out.println("Valor em Real: " + valorReal);
        input.close();
    }
}
