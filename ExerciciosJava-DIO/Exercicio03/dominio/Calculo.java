package Exercicio03.dominio;

import java.util.Scanner;

public class Calculo implements InterfaceCalculo {
    private final int A;
    private final int B;
    private int C;

    Scanner input = new Scanner(System.in);

    public Calculo() {
        System.out.print("Digite o valor de A: ");
        A = input.nextInt();
        System.out.print("Digite o valor de B: ");
        B = input.nextInt();
        input.close();
    }

    @Override
    public boolean valoresIguais() {
        return A == B;
    }

    public void imprime() {
        if (valoresIguais()) {
            C = A + B;
            System.out.println("Os valores são iguais, então o valor de C é " + C);
        } else {
            C = A * B;
            System.out.println("Os valores são diferentes, então o valor de C é " + C);
        }
    }
}
