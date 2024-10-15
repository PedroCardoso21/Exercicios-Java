package ExerciciosInternet.Exercicio4.dominio;

public class Comedia extends Filme {
    private final String genero;

    public Comedia(String nome, String autor, String tempoDuracoa, String genero) {
        super(nome, autor, tempoDuracoa);
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Comedia{" +
                "titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", tempoDuracao='" + tempoDuracao + '\'' +
                ", autor='" + autor + '\'' +
                '}';
    }
}
