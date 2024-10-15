package Exercicio17.dominio;

import java.util.Scanner;

public class Temperatura implements InterfaceTemperatura {
    private double temperaturaCelsius;

    Scanner input = new Scanner(System.in);

    public Temperatura() {
        System.out.print("Digite a temperatura em Celsius: ");
        temperaturaCelsius = input.nextDouble();
        input.close();
    }

    @Override
    public double conversaoFahrenheit() {
        return temperaturaCelsius * 1.8 + 32;
    }

    @Override
    public String toString() {
        return "Temperatura{" +
                "temperaturaCelsius=" + temperaturaCelsius +
                "temperaturaFahrenheit=" + conversaoFahrenheit() +
                '}';
    }
}
