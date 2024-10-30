package ExerciciosInternet.Polimorfismo.Exercicio1.dominio;

public class ContaCorrente implements Transacoes{
    protected double saldo;

    public ContaCorrente(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double quantia) {
     saldo += quantia;
    }

    public void sacar(double quantia) {
        saldo -= quantia;
    }

    public double getSaldo() {
        return saldo;
    }
}
