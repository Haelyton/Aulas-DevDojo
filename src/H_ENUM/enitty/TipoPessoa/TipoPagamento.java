package H_ENUM.enitty.TipoPessoa;

public enum TipoPagamento {

    CREDITO(1, "CRÉDITO"){
        @Override
        public double calcularDesconto(final double valor) {
            return valor * 0.05;
        }
    },
    DEBITO(2, "DÉBITO"){
        @Override
        public double calcularDesconto(final double valor) {
            return valor * 0.1;
        }
    };

    public final int FORMA_PAGAMENTO;
    public final String TIPO;

    TipoPagamento(int formaPagamento, String tipo) {
        this.FORMA_PAGAMENTO = formaPagamento;
        this.TIPO = tipo;
    }

    public double calcularDesconto(double valor) {
        return 0;
    }
}
