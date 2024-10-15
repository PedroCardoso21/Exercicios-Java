package ExerciciosInternet.Exercicio3.test;

import ExerciciosInternet.Exercicio3.dominio.*;

public class Main {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(15, 10, "Vermelho");
        Triangulo triangulo = new Triangulo(10, 18, "Verde");
        Quadrado quadrado = new Quadrado(8, "Azul");
        Circulo circulo = new Circulo(9, "Cinza");

        System.out.println(retangulo);
        System.out.println(triangulo);
        System.out.println(quadrado);
        System.out.println(circulo);
    }
}
