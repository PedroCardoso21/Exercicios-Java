package Exercicio07.dominio;

import java.util.Scanner;

public class Bool {
    private final boolean valor1;
    private final boolean valor2;
    Scanner input = new Scanner(System.in);

    public Bool() {
        System.out.print("Digite o primeiro valor booleano (True/False): ");
        valor1 = input.nextBoolean();
        System.out.print("Digite o segundo valor booleano (True/False): ");
        valor2 = input.nextBoolean();
        input.close();
    }

    @Override
    public String toString() {
        if (valor1 && valor2) {
            return "Os valores são verdadeiros";
        } else if(!valor1 && !valor2) {
            return "Os valores são falsos";
        } else {
            return "Os valores são diferentes";
        }
    }
}
