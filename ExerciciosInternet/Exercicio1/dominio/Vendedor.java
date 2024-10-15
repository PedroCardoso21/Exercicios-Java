package ExerciciosInternet.Exercicio1.dominio;

public class Vendedor extends Funcionario {
    private final double comissao;
    private final String cargo;

    public Vendedor(String nome, String matricula, double salarioBase, String cargo) {
        super(nome, matricula, salarioBase);
        this.cargo = cargo;
        if (salarioBase < 1000) {
            this.comissao = 1.1;
        } else {
            this.comissao = 1.15;
        }
    }

    @Override
    public double calculaSalario() {
        return salarioBase * comissao;
    }

    @Override
    public void imprimeFuncionario() {
        System.out.println("Cargo: " + this.cargo);
        super.imprimeFuncionario();
    }
}
