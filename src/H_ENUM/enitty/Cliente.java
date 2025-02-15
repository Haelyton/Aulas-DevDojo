package H_ENUM.enitty;

import H_ENUM.enitty.TipoPessoa.TipoCliente;

public class Cliente {

    private String nome;
    private TipoCliente tipoCliente;

    public Cliente(final String nome, final TipoCliente tipoCliente) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente +
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
