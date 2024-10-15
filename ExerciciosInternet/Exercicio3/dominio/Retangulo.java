package ExerciciosInternet.Exercicio3.dominio;

public class Retangulo extends Figura {
    private double lado1;
    private double lado2;

    public Retangulo(double lado1, double lado2, String cor) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        super.setCor(cor);
    }

    public double area() {
        return lado1 * lado2;
    }

    @Override
    public String toString() {
        return "Retangulo{" +
                "Cor=" + super.getCor() + ", " +
                "lado1=" + lado1 +
                ", lado2=" + lado2 +
                ", area=" + area() +
                '}';
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }
}
