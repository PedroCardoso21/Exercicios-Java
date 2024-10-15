package ExerciciosInternet.Exercicio2.test;

import ExerciciosInternet.Exercicio2.dominio.Aniversario;
import ExerciciosInternet.Exercicio2.dominio.CartaoWeb;
import ExerciciosInternet.Exercicio2.dominio.DiaDosNamorados;
import ExerciciosInternet.Exercicio2.dominio.Natal;

public class CartaoWebTest {
    public static void main(String[] args) {
        Aniversario aniversario = new Aniversario("Pedro");
        DiaDosNamorados namorados = new DiaDosNamorados("Ana");
        Natal natal = new Natal("Norma");
        CartaoWeb[] cartoes = {aniversario, natal, namorados};

        for (CartaoWeb cartao : cartoes) {
            cartao.showMessage();
        }
    }
}
