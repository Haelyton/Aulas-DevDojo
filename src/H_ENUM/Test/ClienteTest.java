package H_ENUM.Test;

import H_ENUM.enitty.Cliente;
import H_ENUM.enitty.TipoPessoa.TipoCliente;
import H_ENUM.enitty.TipoPessoa.TipoPagamento;

class ClienteTest {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Tsubasa", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente2 = new Cliente("akira", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);
        Cliente cliente3 = new Cliente("bell", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente4 = new Cliente("tanjiro", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);

        System.out.println(cliente);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(200));
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(200));
    }

}