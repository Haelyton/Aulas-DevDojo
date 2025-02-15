package H_ENUM.enitty.TipoPessoa;

public enum TipoCliente {

    PESSOA_FISICA(1, "PESSOA_FISICA"),
    PESSOA_JURIDICA(2, "PESSOA_JURIDICA");

    public final int VALOR;
    public final String TIPO_PESSOA;

    TipoCliente(int valor, String tipoPessoa) {
        this.VALOR = valor;
        this.TIPO_PESSOA = tipoPessoa;
    }
}
