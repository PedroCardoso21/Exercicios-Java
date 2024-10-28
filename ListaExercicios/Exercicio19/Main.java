/**********************************************************************************************************
 Escreva um programa que leia três valores para os lados de um triângulo (variáveis A, B e C). Verificar se cada
 lado é menor que a soma dos outros dois lados. Se sim, saber de A==B e se B==C, sendo verdade o triângulo é
 eqüilátero; Se não, verificar de A==B ou se A==C ou se B==C, sendo verdade o triângulo é isósceles; e caso
 contrário, o triângulo será escaleno. Caso os lados fornecidos não caracterizarem um triângulo, avisar a
 ocorrência.
 ***********************************************************************************************************/
package ListaExercicios.Exercicio19;

public class Main {
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo(15, 14, 30);
        new TestesTriangulo(triangulo);
    }
}
