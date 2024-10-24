package ExerciciosChatGPT.SistemaFuncionarios;

public class Desenvolvedor extends Funcionario{
    private final int horasExtras;
    private final double valorHoraExtra;
    private boolean promover;

    public Desenvolvedor(int horasExtras, double valorHoraExtra, String nome, double salarioBase) {
        super(nome, salarioBase);
        this.horasExtras = horasExtras;
        this.valorHoraExtra = valorHoraExtra;
        this.promover = false;
    }

    @Override
    public double calcularSalario() {
        if (promover) {
            return (salarioBase + horasExtras * valorHoraExtra) * 1.05;
        } else {
            return salarioBase + horasExtras * valorHoraExtra;
        }
    }

    public void promover() {
        promover = true;
    }

    @Override
    public void informacoes() {
        System.out.println("Nome do desenvolvedor: " + super.nome);
        System.out.println("Salário: " + this.calcularSalario());
        this.promover();
        System.out.println("Salário após ser promovido: " + this.calcularSalario());
        System.out.println("-------------------------------------------------------");
    }
}
