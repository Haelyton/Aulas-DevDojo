package D_Heranca.Tests;

import D_Heranca.Domain.Endereco;
import D_Heranca.Domain.Funcionario;
import D_Heranca.Domain.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = Endereco.builder().build();
        endereco.setRua("Rua das Flores");
        endereco.setCep("12345-678");

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Jiraya");
        pessoa.setCpf("123.456.789-00");
        pessoa.setEndereco(endereco);

        pessoa.imprimi();

        System.out.println("====================================");
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Abobra");
        funcionario.setCpf("987.654.321-00");
        funcionario.setEndereco(endereco);

        funcionario.imprimi();
    }
}
