/**********************************************************************************************************
 Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade dessa
 pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias.
 ***********************************************************************************************************/
package ListaExercicios.Exercicio9;

import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        int anos, meses, dias;
        Scanner input =  new Scanner(System.in);
        Calculo tempo = new Calculo();

        System.out.print("Anos de vida: ");
        anos = input.nextInt();
        System.out.print("Meses de vida: ");
        meses = input.nextInt();
        System.out.print("Dias de vida: ");
        dias = input.nextInt();

        tempo.tempoDeVida(anos, meses, dias);
    }
}
