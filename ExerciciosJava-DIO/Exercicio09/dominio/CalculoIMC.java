package Exercicio09.dominio;

import java.util.Scanner;

public class CalculoIMC {
    private final double peso;
    private final double altura;
    private double imc;

    Scanner input = new Scanner(System.in);

    public CalculoIMC() {
        System.out.print("Digite o seu peso: ");
        peso = input.nextDouble();
        System.out.print("Digite a sua altura: ");
        altura = input.nextDouble();
        imc = peso / (altura * altura);
        input.close();
    }

    @Override
    public String toString() {
        if (imc < 18.5) {
            return "Seu IMC é: " + imc + "\nAbaixo do peso";
        } else if (imc >= 18.5 && imc < 25) {
            return "Seu IMC é: " + imc + "\nPeso ideal (parabéns)";
        } else if(imc >= 25 && imc < 30) {
            return "Seu IMC é: " + imc + "\nLevemente acima do peso";
        } else if (imc >= 30 && imc < 35) {
            return "Seu IMC é: " + imc + "\nObesidade grau I";
        } else if (imc >= 35 && imc < 40) {
            return "Seu IMC é: " + imc + "\nObesidade grau II (severa)";
        } else {
            return "Seu IMC é: " + imc + "\nObesidade grau III (mórbida)";
        }
    }
}
