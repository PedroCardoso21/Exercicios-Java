package ExerciciosInternet.Exercicio1.dominio;

public abstract class Funcionario {
    protected final String nome;
    protected final String matricula;
    protected final double salarioBase;

    public Funcionario(String nome, String matricula, double salarioBase) {
        this.nome = nome;
        this.matricula = matricula;
        this.salarioBase = salarioBase;
    }

    public abstract double calculaSalario();

    public void imprimeFuncionario() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Matricula: " + this.matricula);
        System.out.println("Salário: " + calculaSalario());
        System.out.println("---------------------------");
    }
}
