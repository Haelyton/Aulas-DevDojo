package H_ENUM.Test;

import H_ENUM.enitty.Cliente;
import H_ENUM.enitty.TipoPessoa.TipoCliente;

class ClienteTest {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Tsubasa", TipoCliente.PESSOA_FISICA);
        Cliente cliente2 = new Cliente("Tsubasa", TipoCliente.PESSOA_JURIDICA);
        Cliente cliente3 = new Cliente("Tsubasa", TipoCliente.PESSOA_FISICA);
        Cliente cliente4 = new Cliente("Tsubasa", TipoCliente.PESSOA_JURIDICA);

        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);
        System.out.println(cliente);
    }

}