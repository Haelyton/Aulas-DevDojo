package K_Polimorfismo.Domain;

public class Computador extends Produto {
    public static final double IMPOSTO = 0.2;

    public Computador(String nome, double valor) {
        super(nome, valor);
    }

    public double calcularImposto() {
        System.out.println("Calculando Imposto do PC");
        return this.valor * 0.2;
    }
}