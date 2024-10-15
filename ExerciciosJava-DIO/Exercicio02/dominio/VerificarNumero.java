package Exercicio02.dominio;

import java.util.Scanner;

public class VerificarNumero implements InterfaceVerificarNumero{
    private final int valor;

    Scanner input  = new Scanner(System.in);

    public VerificarNumero() {
        System.out.print("Digite um número inteiro: ");
        valor = input.nextInt();
        input.close();
    }

    @Override
    public boolean par() {
        return valor % 2 == 0;
    }

    @Override
    public boolean positivo() {
        return valor >= 0;
    }

    public void imprime() {
        if(par() && positivo()) {
            System.out.println("O número é par e positivo");
        } else if (par() && !positivo()) {
            System.out.println("O número é par e negativo");
        } else if (!par() && positivo()) {
            System.out.println("O número é ímpar e positivo");
        } else {
            System.out.println("O número é ímpar e negativo");
        }
    }
}
