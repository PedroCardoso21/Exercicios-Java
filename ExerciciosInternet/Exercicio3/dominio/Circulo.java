package ExerciciosInternet.Exercicio3.dominio;

public class Circulo extends Figura {
    private double raio;

    public Circulo(double raio, String cor) {
        this.raio = raio;
        super.setCor(cor);
    }

    public double area() {
        return 3.14 * (raio * raio);
    }

    public double diametro() {
        return raio * 2;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "Cor=" + getCor() +
                ", raio=" + raio +
                ", area=" + area() +
                ", diametro=" + diametro() +
                '}';
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}
