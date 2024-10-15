package ExerciciosInternet.Exercicio3.dominio;

public class Quadrado extends Figura {
    private double lado;

    public Quadrado(double lado, String cor) {
        this.lado = lado;
        super.setCor(cor);
    }

    public double area() {
        return lado * lado;
    }

    @Override
    public String toString() {
        return "Quadrado{" +
                "Cor='" + cor +
                ", lado=" + lado +
                ", area=" + area() +
                '}';
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}
