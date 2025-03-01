package K_Polimorfismo.Test;

import K_Polimorfismo.Service.CalcularImpostos;
import K_Polimorfismo.Domain.Computador;
import K_Polimorfismo.Domain.Tomate;

public class ProdutoTest03 {
    public ProdutoTest03() {
    }

    public static void main(String[] args) {
        new Computador("pczaoo", 3599.0);
        Tomate tomate = new Tomate("Americano", 30.0);
        tomate.setDataValidade("13/34/3333");
        CalcularImpostos.calcularImpostoProduto(tomate);
    }
}