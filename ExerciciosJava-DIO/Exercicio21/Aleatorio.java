package Exercicio21;

import java.util.Random;

public class Aleatorio {
    public static void main(String[] args) {
        int valor;
        Random gerador = new Random();

        valor = gerador.nextInt(101);
        System.out.println(valor);
    }
}
