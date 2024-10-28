/**********************************************************************************************************
 Faça um programa que leia um número inteiro e mostre uma mensagem na tela indicando se este número é
 positivo ou negativo. Pare a execução do programa quando o usuário requisitar.
 ***********************************************************************************************************/
package ListaExercicios.Exercicio21;

import java.util.Objects;
import java.util.Scanner;

public class TrueOrFalse {
    public static void main(String[] args) {
        String resposta = "";
        float valor;

        Scanner input = new Scanner(System.in);

        while (!Objects.equals(resposta, "nao")) {
            System.out.print("Digite um número para ver se é negativo ou positivo: ");
            valor = input.nextFloat();
            if (valor < 0) {
                System.out.println("Valor negativo");
            } else {
                System.out.println("Valor positivo");
            }
            System.out.println("Quer continuar ? (nao para sair)");
            resposta = input.next();
        }
    }
}
