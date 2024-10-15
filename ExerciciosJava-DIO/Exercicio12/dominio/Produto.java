package Exercicio12.dominio;

import java.util.Scanner;

public class Produto implements InterfaceProduto {
    private double valor;
    private final FormaPagamento formaPagamento;

    Scanner input =  new Scanner(System.in);

    public Produto () {
        System.out.print("Digite o valor do produto: ");
        valor = input.nextDouble();
        System.out.println("Tabela de Opções: ");
        System.out.println("1 - DINHEIRO_OU_PIX, recebe 15% de desconto");
        System.out.println("2 - CREDITO_A_VISTA, recebe 10% de desconto");
        System.out.println("3 - CREDITO_PARCELADO_DUAS_VEZES, preço normal do produto sem juros");
        System.out.println("4 - CREDITO_PARCELADO_TRES_VEZES_MAIS, preço normal do produto mais juros de 10%");
        System.out.print("Digite a forma de pagamento: ");
        formaPagamento = FormaPagamento.valueOf(input.next());
        input.close();
    }

    @Override
    public double calculaValorNovo() {
        if (formaPagamento == FormaPagamento.DINHEIRO_OU_PIX) {
            return valor - valor * 0.15;
        } else if (formaPagamento == FormaPagamento.CREDITO_A_VISTA) {
            return valor - valor * 0.10;
        } else if (formaPagamento == FormaPagamento.CREDITO_PARCELADO_DUAS_VEZES) {
            return valor;
        } else {
            return valor + valor * 0.10;
        }
    }

    @Override
    public String toString() {
        return "Produto{" +
                "valor=" + valor +
                ", formaPagamento=" + formaPagamento.getTipoPagamento() +
                ", valorNovo=" + calculaValorNovo() +
                '}';
    }
}
