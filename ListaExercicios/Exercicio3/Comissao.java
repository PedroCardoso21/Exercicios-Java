/************************************************************************************************************
Faça um programa para pagamento de comissão de vendedores de peças, levando-se em consideração que sua
comissão será de 5% do total da venda e que você tem os seguintes dados:
- Identificação do vendedor
- Código da peça
- Preço unitário da peça
- Quantidade vendida
 ***********************************************************************************************************/
package ListaExercicios.Exercicio3;

import java.util.Scanner;

public class Comissao {
    public static void main(String[] args) {
        String nomeVendedor, codigoPeca;
        double valorPeca, totalVenda, comissao;
        int quantidadePecasVendidas;

        Scanner input = new Scanner(System.in);

        System.out.println("Comissão de Vendedores");
        System.out.print("Digite o nome do Vendedor: ");
        nomeVendedor = input.nextLine();
        System.out.print("Digite o código da peça: ");
        codigoPeca = input.nextLine();
        System.out.print("Digite o valor unitário da peça: ");
        valorPeca = input.nextDouble();
        System.out.print("Digite a quantidade de peças vendidas: ");
        quantidadePecasVendidas = input.nextInt();
        totalVenda = valorPeca * quantidadePecasVendidas;
        comissao = totalVenda * 0.05;
        System.out.println("A comissão foi de: " + comissao);
        System.out.println("Valor a ser pago: " + (totalVenda - comissao));
        input.close();
    }
}
