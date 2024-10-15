package ExerciciosInternet.Exercicio4.dominio;

public class Acao extends Filme {
    private final String genero;

    public Acao(String nome, String autor, String tempoDuracao, String genero) {
        super(nome, autor, tempoDuracao);
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Acao{" +
                "titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", tempoDuracao='" + tempoDuracao + '\'' +
                ", autor='" + autor + '\'' +
                '}';
    }
}
