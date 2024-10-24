package ExerciciosChatGPT.SistemaFuncionarios;

public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Pedro", 5000, 600);
        gerente.informacoes();

        Desenvolvedor desenvolvedor = new Desenvolvedor(15, 70, "Lucio", 3000);
        desenvolvedor.informacoes();
    }
}
