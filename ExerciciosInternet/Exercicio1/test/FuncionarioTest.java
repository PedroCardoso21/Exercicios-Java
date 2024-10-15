package ExerciciosInternet.Exercicio1.test;

import ExerciciosInternet.Exercicio1.dominio.Assistente;
import ExerciciosInternet.Exercicio1.dominio.Funcionario;
import ExerciciosInternet.Exercicio1.dominio.Gerente;
import ExerciciosInternet.Exercicio1.dominio.Vendedor;

public class FuncionarioTest {
    public static void main(String[] args) {
        double salario = 0;

        Gerente gerente = new Gerente("Ellen", "24.015", 3400, "Gerente");
        Assistente assistente = new Assistente("Pedro", "23.122", 2300, "Assistente");
        Vendedor vendedor = new Vendedor("Ana", "20.040", 2000, "Vendedor");
        Funcionario[] funcionarios = {gerente, assistente, vendedor};

        for (Funcionario funcionario : funcionarios) {
            salario += funcionario.calculaSalario();
        }
        System.out.println("Folha Salarial: " + salario);
    }
}
