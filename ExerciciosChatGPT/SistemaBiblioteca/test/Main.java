package ExerciciosChatGPT.SistemaBiblioteca.test;

import ExerciciosChatGPT.SistemaBiblioteca.dominio.Categoria;
import ExerciciosChatGPT.SistemaBiblioteca.dominio.Estudante;
import ExerciciosChatGPT.SistemaBiblioteca.dominio.Livro;
import ExerciciosChatGPT.SistemaBiblioteca.dominio.Usuario;
import ExerciciosChatGPT.SistemaBiblioteca.servico.Biblioteca;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954, Categoria.FICCAO);
        Livro livro2 = new Livro("História Geral", "Fulano de Tal", 1999, Categoria.HISTORIA);
        Livro livro3 = new Livro("Introdução à Teologia", "Cicrano", 2005, Categoria.TEOLOGIA);

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);

        Usuario usuario1 = new Usuario("João", "12345");
        Estudante estudante1 = new Estudante("Maria", "54321", "FICCAO");

        usuario1.emprestarLivro(livro1);
        estudante1.emprestarLivro(livro1);
        usuario1.devolverLivro(livro1);

        System.out.println("-------------------------------------");

        biblioteca.listarLivros();
    }
}
