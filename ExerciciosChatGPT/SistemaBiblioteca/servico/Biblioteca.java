package ExerciciosChatGPT.SistemaBiblioteca.servico;

import ExerciciosChatGPT.SistemaBiblioteca.dominio.Gerenciador;
import ExerciciosChatGPT.SistemaBiblioteca.dominio.Livro;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca implements Gerenciador {
    private final List<Livro> livros;

    public Biblioteca() {
        this.livros = new ArrayList<>();
    }

    @Override
    public void adicionarLivro(Livro livro) {
        livros.add(livro);
        System.out.println("Livro adicionado:\n" + livro.informacoes());
    }

    @Override
    public void removerLivro(Livro livro) {
        livros.remove(livro);
        System.out.println("Livro removido: " + livro.informacoes());
    }

    public void listarLivros() {
        System.out.println("Lista de livros na biblioteca:");
        for (Livro livro : livros) {
            System.out.println(livro.informacoes());
        }
    }
}
