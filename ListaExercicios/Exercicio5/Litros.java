/************************************************************************************************************
 Efetuar o cálculo da quantidade de litros de combustível gasta em uma viagem, utilizando um automóvel que faz
 12 Km por litro. Para obter o cálculo, o usuário deve fornecer o tempo gasto na viagem e a velocidade média.
 Desta forma, será possível obter a distância percorrida com a fórmula DISTANCIA = TEMPO * VELOCIDADE.
 Tendo o valor da distância, basta calcular a quantidade de litros de combustível utilizada na viagem com a
 fórmula: LITROS_USADOS = DISTANCIA / 12. O programa deve apresentar os valores da velocidade média,
 tempo gasto, a distância percorrida e a quantidade de litros utilizada na viagem. Dica: trabalhe com valores reais.
 ***********************************************************************************************************/
package ListaExercicios.Exercicio5;

import java.util.Scanner;

public class Litros {
    public static void main(String[] args) {
        double tempoGasto, velocidadeMedia, distanciaPercorrida, quantidadeLitros;

        Scanner input =  new Scanner(System.in);

        System.out.println("Em horas, quanto tempo foi gasto na viagem?");
        tempoGasto = input.nextDouble();
        System.out.println("Em Km/h, qual foi a velocidade média?");
        velocidadeMedia = input.nextDouble();
        System.out.println("Velocidade Média: " + velocidadeMedia + " Km/h");
        System.out.println("Tempo gasto: " + tempoGasto + " Horas");
        distanciaPercorrida = tempoGasto * velocidadeMedia;
        System.out.println("Distância percorrida: " + distanciaPercorrida + " Km");
        quantidadeLitros = distanciaPercorrida / 12;
        System.out.println("Quantidade de litros utilizado: " + quantidadeLitros + " Litros");
    }
}
