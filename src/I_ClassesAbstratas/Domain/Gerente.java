package I_ClassesAbstratas.Domain;

public class Gerente extends Funcionario {
    private double salary;

    public Gerente(String name, double salario) {
        super(name, salario);
        this.calculaBonus();
    }

    public void calculaBonus() {
        this.salary += this.salary * 0.2;
    }

    public String toString() {
        return "Gerente{nome='" + this.nome + "', salario=" + this.salario + "}";
    }
}