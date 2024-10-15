package Exercicio16.dominio;

import java.util.Scanner;

public class Triangulo implements InterfaceTriangulo {
    private final double ladoA;
    private final double ladoB;
    private final double ladoC;

    Scanner input = new Scanner(System.in);

    public Triangulo() {
        System.out.println("Digite os valores do triângulo abaixo");
        System.out.print("Lado A: ");
        ladoA = input.nextDouble();
        System.out.print("Lado B: ");
        ladoB = input.nextDouble();
        System.out.print("Lado C: ");
        ladoC = input.nextDouble();
        input.close();
    }

    @Override
    public double menorLado() {
        if (ladoA <= ladoB && ladoA <= ladoC) {
            return ladoA;
        } else if (ladoB <= ladoA && ladoB <= ladoC) {
            return ladoB;
        } else {
            return ladoC;
        }
    }

    @Override
    public double maiorLado() {
        if (ladoA >= ladoB && ladoA >= ladoC) {
            return ladoA;
        } else if (ladoB >= ladoA && ladoB >= ladoC) {
            return ladoB;
        } else {
            return ladoC;
        }
    }

    @Override
    public double valorDoMeio() {
        if (ladoA != menorLado() && ladoA != maiorLado()) {
            return ladoA;
        } else if (ladoB != menorLado() && ladoB != maiorLado()) {
            return ladoB;
        } else if (ladoC != menorLado() && ladoC != maiorLado()) {
            return ladoC;
        } else {
            return menorLado();
        }
    }

    @Override
    public boolean existenciaTriangulo() {
        if (menorLado() + valorDoMeio() > maiorLado()) {
            return true;
        } else if (menorLado() == valorDoMeio() && menorLado() == maiorLado()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String tipoTriangulo() {
        if (ladoA == ladoB && ladoA == ladoC) {
            return "Triângulo Equilátero!";
        } else if (ladoA != ladoB && ladoA != ladoC) {
            return "Triângulo Escaleno!";
        } else {
            return "Triângulo Isósceles";
        }
    }

    @Override
    public String toString() {
        if (existenciaTriangulo()) {
            return "Tipo do triângulo -> " + tipoTriangulo();
        } else {
            return "O triângulo é inválido.";
        }
    }
}
