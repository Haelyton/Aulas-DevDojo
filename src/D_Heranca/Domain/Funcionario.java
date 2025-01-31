package D_Heranca.Domain;

public class Funcionario extends Pessoa {

    private double salario;

    public void imprimi() {
        super.imprimi();
        System.out.println(this.salario);
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
