package ExerciciosInternet.Exercicio2.dominio;

public class DiaDosNamorados extends CartaoWeb {
    public DiaDosNamorados (String destinatario) {
        super(destinatario);
    }

    @Override
    public void showMessage() {
        System.out.println("Feliz dia dos namorados, " + destinatario + "! Sou muito feliz com você");
    }
}
