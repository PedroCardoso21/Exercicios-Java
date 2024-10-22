package ListaExercicios.Exercicio9;

public class Calculo {
    private int tempoDeVida;

    public void tempoDeVida(int anos, int meses, int dias) {
        tempoDeVida = anos * 365 + meses * 30 + dias;
        System.out.println("Tempo de Vida: " + tempoDeVida + " dias");
    }
}
