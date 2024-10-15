package ExerciciosInternet.Exercicio2.dominio;

public class Natal extends CartaoWeb {
    public Natal (String destinatario) {
        super(destinatario);
    }

    @Override
    public void showMessage() {
        System.out.println("Feliz Natal " + destinatario + "! Que ganhe muitos presentes");
    }
}
