package I_ClassesAbstratas.Domain;

public class DesenvolvedorDvd extends Funcionario {
    private String nome;
    private double salary;

    public DesenvolvedorDvd(String nome, double salary) {
        super(nome, salary);
        this.nome = nome;
        this.salary = salary;
    }

    public void calculaBonus() {
        this.salary += this.salary * 0.1;
    }

    public String toString() {
        return "DesenvolvedorDvd{nome='" + this.nome + "', salary=" + this.salary + "}";
    }
}