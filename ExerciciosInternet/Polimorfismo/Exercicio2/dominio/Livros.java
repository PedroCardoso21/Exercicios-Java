package ExerciciosInternet.Polimorfismo.Exercicio2.dominio;

public class Livros extends Produto {
    private final String autor;

    public Livros(String nome, double preco, String autor) {
        super(nome, preco);
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Livros{" +
                "nome='" + getNome() + '\'' +
                ", preco='" + getPreco() + '\'' +
                ", autor=" + autor +
                '}';
    }

    public String getAutor() {
        return autor;
    }
}
