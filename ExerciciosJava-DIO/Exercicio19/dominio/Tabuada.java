package Exercicio19.dominio;

public class Tabuada {
    private int multiplicando;
    private int multiplicador = 1;

    public Tabuada() {
        while (multiplicando < 10) {
            multiplicando++;
            multiplicador = 1;
            System.out.println("Tabuada de " + multiplicando);
            while(multiplicador <= 10) {
                int produto = multiplicando *  multiplicador;
                System.out.println(multiplicando + " x " + multiplicador + " = " + produto);
                multiplicador++;
            }
            System.out.println("-----------------------------");
        }
    }
}
