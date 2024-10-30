package ExerciciosInternet.Polimorfismo.Exercicio2.dominio;

public class CDs extends Produto{
    private final int numeroDeFaixas;

    public CDs(String nome, double preco, int numeroDeFaixas) {
        super(nome, preco);
        this.numeroDeFaixas = numeroDeFaixas;
    }

    @Override
    public String toString() {
        return "CDs{" +
                "nome=" + getNome() +
                ", preco='" + getPreco() + '\'' +
                ", numeroDeFaixas=" + numeroDeFaixas +
                '}';
    }

    public int getNumeroDeFaixas() {
        return numeroDeFaixas;
    }
}
