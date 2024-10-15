package ExerciciosInternet.Exercicio3.dominio;

public class Triangulo extends Figura {
    private double base;
    private double altura;

    public Triangulo(double base, double altura, String cor) {
        this.base = base;
        this.altura = altura;
        super.setCor(cor);
    }

    public double area() {
        return base * altura;
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                "Cor=" + getCor() + ", " +
                "base=" + base +
                ", altura=" + altura +
                ", area=" + area() +
                '}';
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
