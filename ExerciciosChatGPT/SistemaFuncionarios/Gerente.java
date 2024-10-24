package ExerciciosChatGPT.SistemaFuncionarios;

public class Gerente extends Funcionario{
    private final double bonus;
    private boolean promover;

    public Gerente(String nome, double salario, double bonus) {
        super(nome, salario);
        this.bonus = bonus;
        promover = false;
    }

    @Override
    public double calcularSalario() {
        if (promover) {
            return (salarioBase + bonus) * 1.10;
        } else {
            return salarioBase + bonus;
        }
    }

    public void promover() {
        this.promover = true;
    }

    @Override
    public void informacoes() {
        System.out.println("Nome do Gerente: " + super.nome);
        System.out.println("Salário: " + this.calcularSalario());
        this.promover();
        System.out.println("Salário após ser promovido: " + this.calcularSalario());
        System.out.println("-------------------------------------------------------");
    }
}
