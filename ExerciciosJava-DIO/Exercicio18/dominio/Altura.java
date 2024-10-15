package Exercicio18.dominio;

public class Altura {
    private double alturaFrancisco = 1.5;
    private double alturaSara = 1.1;
    private int anos;

    public Altura() {
        while (alturaFrancisco > alturaSara) {
            alturaFrancisco += 0.02;
            alturaSara += 0.03;
            anos += 1;
        }
        System.out.println("São necessários " + anos + " anos para Sara ser maior que Francisco");
    }
}
