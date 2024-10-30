package ExerciciosInternet.Polimorfismo.Exercicio1.test;

import ExerciciosInternet.Polimorfismo.Exercicio1.dominio.ClienteEspecial;
import ExerciciosInternet.Polimorfismo.Exercicio1.dominio.ClienteNormal;

public class Main {
    public static void main(String[] args) {
        ClienteNormal normal = new ClienteNormal("Pedro", "Itau", 1200);
        ClienteEspecial especial = new ClienteEspecial("Ana", "Nubank", 1200);

        System.out.println(normal);
        System.out.println(especial);

        System.out.println("--------------------------------------------------");

        normal.depositar(800);
        especial.depositar(800);

        System.out.println("Saldo pós depósito:");

        System.out.println(normal);
        System.out.println(especial);

        System.out.println("-----------------------------------------");

        normal.sacar(800);
        especial.sacar(800);

        System.out.println("Saldo pós saque:");
        System.out.println("Aplicando taxa de 5% para cliente normal e 1% para cliente especial");

        System.out.println(normal);
        System.out.println(especial);
    }
}
