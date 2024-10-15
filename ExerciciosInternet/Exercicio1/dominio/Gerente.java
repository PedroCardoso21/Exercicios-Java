package ExerciciosInternet.Exercicio1.dominio;

public class Gerente extends Funcionario {
    private final String cargo;

    public Gerente(String nome, String matricula, double salarioBase, String cargo) {
        super(nome, matricula, salarioBase);
        this.cargo = cargo;
    }

    @Override
    public double calculaSalario() {
        return salarioBase * 2;
    }

    @Override
    public void imprimeFuncionario() {
        System.out.println("Cargo: " + this.cargo);
        super.imprimeFuncionario();
    }
}
