package Exercicio15.dominio;

import java.util.Scanner;

public class Ano implements InterfaceAno {
    private final int anoNascimento;

    Scanner input = new Scanner(System.in);

    public Ano() {
        System.out.print("Digite o ano em que você nasceu: ");
        anoNascimento = input.nextInt();
        input.close();
    }

    @Override
    public int calculaAnos() {
        return 2024 - anoNascimento;
    }

    @Override
    public int calculaMeses() {
        return calculaAnos() * 12;
    }

    @Override
    public int calculaDias() {
        return calculaAnos() * 365;
    }

    @Override
    public String toString() {
        return calculaAnos() + " anos, " + calculaMeses() + " meses, " + calculaDias() + " dias de vida";
    }
}

