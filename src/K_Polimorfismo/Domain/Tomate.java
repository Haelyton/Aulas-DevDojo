package K_Polimorfismo.Domain;

public class Tomate extends Produto {
    public static final double IMPOSTO = 0.25;
    private String dataValidade;

    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    public double calcularImposto() {
        System.out.println("Calculando Imposto Tomate");
        return this.valor * 0.25;
    }

    public String getDataValidade() {
        return this.dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }
}