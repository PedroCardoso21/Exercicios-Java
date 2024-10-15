package ExerciciosInternet.Exercicio4.dominio;

public class Romance extends Filme {
    private final String genero;

    public Romance(String nome, String autor, String tempoDuracao, String genero) {
        super(nome, autor, tempoDuracao);
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Romance{" +
                "titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", tempoDuracao='" + tempoDuracao + '\'' +
                ", autor='" + autor + '\'' +
                '}';
    }
}
