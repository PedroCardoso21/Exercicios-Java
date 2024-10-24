package ExerciciosChatGPT.SistemaBiblioteca.dominio;

public class Usuario {
    private final String nome;
    private final String matricula;

    public Usuario(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public void emprestarLivro(Livro livro) {
        if (livro.isDisponivel()) {
            livro.emprestar();
        } else {
            System.out.println("O livro não está disponível.");
        }
    }

    public void devolverLivro(Livro livro) {
        livro.devolver();
    }
}

