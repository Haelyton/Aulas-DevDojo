package H_ENUM.enitty;

import H_ENUM.enitty.TipoPessoa.TipoCliente;
import H_ENUM.enitty.TipoPessoa.TipoPagamento;

public class Cliente {

    private String nome;
    private TipoCliente tipoCliente;
    private TipoPagamento tipoPagamento;

    public Cliente(final String nome, final TipoCliente tipoCliente, final TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente.VALOR + " " + tipoCliente.TIPO_PESSOA +
                ", tipoPagamento=" + tipoPagamento.FORMA_PAGAMENTO + " " + tipoPagamento.TIPO +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(final String nome) {
        this.nome = nome;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(final TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
}
