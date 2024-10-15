package ExerciciosInternet.Exercicio4.test;

import ExerciciosInternet.Exercicio4.dominio.Acao;
import ExerciciosInternet.Exercicio4.dominio.Comedia;
import ExerciciosInternet.Exercicio4.dominio.Filme;
import ExerciciosInternet.Exercicio4.dominio.Romance;

public class FilmeTest {
    public static void main(String[] args) {
        Comedia comedia = new Comedia("Gente Grande", "Dennis Dugan", "1h 42m", "Comédia");
        Acao acao = new Acao("Velozes e Furiosos", "Rob Cohen", "1h 46m", "Ação");
        Romance romance = new Romance("Titanic", "James Cameron", "3h 14m", "Romance");
        Filme[] filmes = {comedia, acao, romance};

        for (Filme filme : filmes) {
            System.out.println(filme);
        }
    }
}
