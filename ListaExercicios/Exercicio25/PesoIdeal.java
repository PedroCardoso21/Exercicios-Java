/**********************************************************************************************************
 Tendo como dados de entrada a altura e o sexo de uma pessoa, faça um programa que calcule seu peso ideal,
 utilizando as seguintes fórmulas: (h = altura)
 - Para homens: (72.7*h) - 58
 - Para mulheres: (62.1 *h) - 44.7
 ***********************************************************************************************************/
package ListaExercicios.Exercicio25;

import java.util.Scanner;

public class PesoIdeal {
    public static void main(String[] args) {
        double altura;
        char sexo;

        Scanner input = new Scanner(System.in);

        System.out.print("Digite a sua altura: ");
        altura = input.nextDouble();
        System.out.print("Digite o seu gênero (m ou f): ");
        sexo = input.next().charAt(0);

        switch(sexo) {
            case 'm':
                System.out.println("Peso ideal: " + pesoIdealHomem(altura));
                break;
            case 'f':
                System.out.println("Peso ideal: " + pesoIdealMulher(altura));
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }

    public static double pesoIdealHomem(double altura) {
        return 72.7 * altura - 58;
    }

    public static double pesoIdealMulher(double altura) {
        return 62.1 * altura - 44.7;
    }
}
