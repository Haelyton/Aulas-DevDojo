package K_Polimorfismo.Domain;

public class Televisao extends Produto {
    private static final double IMPOSTO = 0.21;

    public Televisao(String nome, double valor) {
        super(nome, valor);
    }

    public double calcularImposto() {
        return this.valor * 0.21;
    }
}