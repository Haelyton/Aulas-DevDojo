package G_ModificadorFinal.domain;

public class Carro {

    private String name;
    private final static double VELOCIDADE_LIMITE = 250;
    public final Comprador COMPRADOR = new Comprador();

    public Comprador getCOMPRADOR() {
        return COMPRADOR;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }
}
