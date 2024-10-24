package ExerciciosChatGPT.SistemaBiblioteca.dominio;

public class Livro {
    private final String titulo;
    private final String autor;
    private final int anoPublicacao;
    private boolean disponivel;
    private final Categoria categoria;

    public Livro(String titulo, String autor, int anoPublicacao, Categoria categoria) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.disponivel = true;
        this.categoria = categoria;
    }

    public void emprestar() {
        if (disponivel) {
            disponivel = false;
            System.out.println("Livro emprestado com sucesso.");
        } else {
            System.out.println("O livro já está emprestado.");
        }
    }

    public void devolver() {
        disponivel = true;
        System.out.println("Livro devolvido com sucesso.");
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public String informacoes() {
        return "Título: " + titulo + "\nAutor: " + autor + "\nAno: " + anoPublicacao + "\nDisponível: " + disponivel + "\nCategoria: " + categoria
                 + "\n---------------------------------------------";
    }
}
