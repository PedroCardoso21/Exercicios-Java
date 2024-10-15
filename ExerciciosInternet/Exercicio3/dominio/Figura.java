package ExerciciosInternet.Exercicio3.dominio;

public abstract class Figura {
    protected String cor;

    public abstract double area();

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }
}
