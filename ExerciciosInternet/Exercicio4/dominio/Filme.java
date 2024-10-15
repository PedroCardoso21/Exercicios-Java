package ExerciciosInternet.Exercicio4.dominio;

public abstract class Filme {
    protected final String titulo;
    protected final String autor;
    protected final String tempoDuracao;

    public Filme(String titulo, String autor, String tempoDuracao) {
        this.titulo = titulo;
        this.autor = autor;
        this.tempoDuracao = tempoDuracao;
    }
}
