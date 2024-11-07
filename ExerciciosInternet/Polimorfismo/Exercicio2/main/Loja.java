package ExerciciosInternet.Polimorfismo.Exercicio2.main;

import ExerciciosInternet.Polimorfismo.Exercicio2.dominio.*;

public class Loja {
    public static void main(String[] args) {
        String nome = "Tenda do Pedrinho";

        Livros livro1 = new Livros("Diário de um Banana", 45, "Jeff Kinney");
        Livros livro2 = new Livros("Extraordinário", 40, "R. J. Palacio");
        DVDs dvd1 = new DVDs("Parasita", 60, 132);
        DVDs dvd2 = new DVDs("Gigantes de Aço", 30, 127);
        CDs cd1 = new CDs("NX Zero", 100, 16);
        CDs cd2 = new CDs("Sorriso Maroto", 50, 14);
        CDs cd3 = new CDs("One Direction", 20, 18);
        Produto[] produtos = {livro1, livro2, dvd1, dvd2, cd1, cd2, cd3};

        System.out.println("Nome da loja: " + nome);
        System.out.println("Produtos:");

        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }
}
