package ExerciciosInternet.Exercicio1.dominio;

public class Assistente extends Funcionario {
    private final String cargo;

    public Assistente(String nome, String matricula, double salarioBase, String cargo) {
        super(nome, matricula, salarioBase);
        this.cargo = cargo;
    }

    @Override
    public double calculaSalario() {
        return salarioBase;
    }

    @Override
    public void imprimeFuncionario() {
        System.out.println("Cargo: " + this.cargo);
        super.imprimeFuncionario();
    }
}
