package ExerciciosInternet.Exercicio2.dominio;

public class Aniversario extends CartaoWeb {
    public Aniversario(String destinatario) {
        super(destinatario);
    }

    @Override
    public void showMessage() {
        System.out.println("Feliz Aniversário " + destinatario + "! Tudo de bom na sua vida! Felicidades!");
    }
}
