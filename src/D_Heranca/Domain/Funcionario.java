package D_Heranca.Domain;

public class Funcionario extends Pessoa {

    private double salario;

    static {
        System.out.println("Dentro do bloco de estático de Funcionario");
    }
    {
        System.out.println("Bloco de inicialização de Funcionario 1");
    }
    {
        System.out.println("Bloco de inicialização de Funcionario 2");
    }

    public Funcionario(String nome) {
        super(nome);
        System.out.println("Dentro do construtor de Funcionario");
    }

    public void imprimi() {
        super.imprimi();
        System.out.printf("%.2f", this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(final double salario) {
        this.salario = salario;
    }

    public void relatorioPagamento() {
        System.out.println(this.nome + " recebeu o salário de " + this.salario);
    }
}
