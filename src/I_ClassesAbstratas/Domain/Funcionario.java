package I_ClassesAbstratas.Domain;

public abstract class Funcionario extends Pessoa {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        this.calculaBonus();
    }

    public void imprimi() {
        System.out.println("Imprimindo...");
    }

    public abstract void calculaBonus();
}