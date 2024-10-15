package ExerciciosInternet.Exercicio5.dominio;

public abstract class Medico {
    protected final String area;

    public Medico(String area) {
        this.area = area;
    }

    public abstract double descontoSalario();
    public abstract void imprime();
}
