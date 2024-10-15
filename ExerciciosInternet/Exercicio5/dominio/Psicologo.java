package ExerciciosInternet.Exercicio5.dominio;

public class Psicologo extends Medico {
    private final String nome;
    private final int idade;
    private final double salario;

    public Psicologo(String area, String nome, int idade, double salario) {
        super(area);
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    @Override
    public double descontoSalario() {
        return salario - (salario * 0.18);
    }

    @Override
    public void imprime() {
        System.out.println("Nome do médico: " + this.nome);
        System.out.println("Idade do médico: " + this.idade);
        System.out.println("Área de atuação: " + this.area);
        System.out.println("Salário Líquido: " + this.salario);
        System.out.println("Salário com desconto: " + this.descontoSalario());
        System.out.println("------------------------------");
    }
}
