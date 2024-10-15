package Exercicio10.dominio;

import java.util.Scanner;

public class Notas implements InterfaceNotas {
    private final float nota1;
    private final float nota2;
    private final float nota3;

    Scanner input = new Scanner(System.in);

    public Notas() {
        System.out.print("Digite a primeira nota: ");
        nota1 = input.nextFloat();
        System.out.print("Digite a segunda nota: ");
        nota2 = input.nextFloat();
        System.out.print("Digite a terceira nota: ");
        nota3 = input.nextFloat();
        input.close();
    }

    @Override
    public float calculaMedia() {
        return (nota1 + nota2 + nota3) / 3;
    }

    @Override
    public String toString() {
        return "Notas{" +
                "nota1=" + nota1 +
                ", nota2=" + nota2 +
                ", nota3=" + nota3 +
                ", média=" + calculaMedia() +
                '}';
    }
}
