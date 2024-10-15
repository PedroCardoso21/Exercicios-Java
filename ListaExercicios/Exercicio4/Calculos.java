package ListaExercicios.Exercicio4;

public class Calculos {
    public void somas(int[] numeros) {
        System.out.println("Somas");
        System.out.println("A + B = " + (numeros[0] + numeros[1]));
        System.out.println("A + C = " + (numeros[0] + numeros[2]));
        System.out.println("A + D = " + (numeros[0] + numeros[3]));
        System.out.println("B + C = " + (numeros[1] + numeros[2]));
        System.out.println("B + D = " + (numeros[1] + numeros[3]));
        System.out.println("C + D = " + (numeros[2] + numeros[3]));
        System.out.println("-------------------------------");
    }

    public void multiplicacoes(int[] numeros) {
        System.out.println("Multiplicações");
        System.out.println("A * B = " + (numeros[0] * numeros[1]));
        System.out.println("A * C = " + (numeros[0] * numeros[2]));
        System.out.println("A * D = " + (numeros[0] * numeros[3]));
        System.out.println("B * C = " + (numeros[1] * numeros[2]));
        System.out.println("B * D = " + (numeros[1] * numeros[3]));
        System.out.println("C * D = " + (numeros[2] * numeros[3]));
    }
}
