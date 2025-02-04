package D_Heranca.Domain;

import lombok.Builder;

import java.security.cert.CertPathBuilder;

public class Pessoa {

    protected String nome;
    protected String cpf;
    protected Endereco endereco;

    static {
        System.out.println("Dentro do bloco de estático de pessoa");
    }
    {
        System.out.println("Bloco de inicialização de pessoa 1");
    }
    {
        System.out.println("Bloco de inicialização de pessoa 2");
    }

    public Pessoa(String nome){
        System.out.println("Dentro do construtor de pessoa");
        this.nome = nome;
    }

    public void imprimi() {
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.endereco.getRua() + " " + this.endereco.getCep());
    }
    
    public Pessoa(final String cpf, final Endereco endereco, final String nome) {
        this.cpf = cpf;
        this.endereco = endereco;
        this.nome = nome;
    }

    public Pessoa() {
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(final String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(final Endereco endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(final String nome) {
        this.nome = nome;
    }
}
