package Exercicio24.dominio;

import java.util.Scanner;

public class Carro implements InterfaceCarro {
    public final double distancia;
    public final double velocidadeMedia;

    Scanner input = new Scanner(System.in);

    public Carro() {
        System.out.print("Digite a distância da viagem, em Km: ");
        distancia = input.nextDouble();
        System.out.print("Digite a velocidade média do carro, em Km/h: ");
        velocidadeMedia = input.nextDouble();
        input.close();
        System.out.println("Tempo gasto na viagem a velocidade média -> " + tempoGasto() + " horas");
        System.out.println("Distância percorrida -> " + distancia + " km");
        System.out.println("Litros utilizados na viagem -> " + litrosUsados() + " litros");
    }

    @Override
    public double tempoGasto() {
        return distancia / velocidadeMedia;
    }

    @Override
    public double litrosUsados() {
        return distancia / 12;
    }
}
