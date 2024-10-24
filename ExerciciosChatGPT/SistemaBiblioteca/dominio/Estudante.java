package ExerciciosChatGPT.SistemaBiblioteca.dominio;

public class Estudante extends Usuario {
    private String curso;

    public Estudante(String nome, String matricula, String curso) {
        super(nome, matricula);
        this.curso = curso;
    }

    @Override
    public void emprestarLivro(Livro livro) {
        if (livro.getCategoria().toString().equalsIgnoreCase(curso)) {
            super.emprestarLivro(livro);
        } else {
            System.out.println("Este livro não corresponde ao curso do estudante.");
        }
    }
}
