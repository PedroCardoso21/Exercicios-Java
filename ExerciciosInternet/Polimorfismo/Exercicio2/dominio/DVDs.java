package ExerciciosInternet.Polimorfismo.Exercicio2.dominio;

public class DVDs extends Produto{
    private final int duracao;

    public DVDs(String nome, double preco, int duracao) {
        super(nome, preco);
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return "DVDs{" +
                "nome='" + getNome() + '\'' +
                ", preco='" + getPreco() + '\'' +
                ", duracao=" + duracao +
                '}';
    }

    public int getDuracao() {
        return duracao;
    }
}
