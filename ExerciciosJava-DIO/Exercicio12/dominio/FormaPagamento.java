package Exercicio12.dominio;

public enum FormaPagamento {
    DINHEIRO_OU_PIX("Dinheiro ou Pix a vista"),
    CREDITO_A_VISTA("Crédito a vista"),
    CREDITO_PARCELADO_DUAS_VEZES("Crédito parcelado duas vezes"),
    CREDITO_PARCELADO_TRES_VEZES_MAIS("Crédito parcelado três vezes ou mais");
    private final String tipoPagamento;

    FormaPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }
}
