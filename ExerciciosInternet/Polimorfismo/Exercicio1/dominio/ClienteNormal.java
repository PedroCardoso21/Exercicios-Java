package ExerciciosInternet.Polimorfismo.Exercicio1.dominio;

public class ClienteNormal extends ContaCorrente {
    private final String nome;
    private final String banco;

    public ClienteNormal(String nome, String banco, double saldo) {
        super(saldo);
        this.nome = nome;
        this.banco = banco;
    }

    public void sacar(double quantia) {
        saldo = (saldo - quantia) - quantia * 0.05;
    }

    public String getNome() {
        return nome;
    }

    public String getBanco() {
        return banco;
    }

    @Override
    public String toString() {
        return "ClienteNormal{" +
                "nome='" + nome + '\'' +
                ", banco='" + banco + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
