package K_Polimorfismo.Service;

import K_Polimorfismo.Domain.Produto;
import K_Polimorfismo.Domain.Tomate;

public class CalcularImpostos {
    public CalcularImpostos() {
    }

    public static void calcularImpostoProduto(Produto produto) {
        double imposto = produto.calcularImposto();
        System.out.println("Nome:" + produto.getNome());
        System.out.println("Valor: " + produto.getValor());
        System.out.println("Imposto a ser pago: " + imposto);
        if (produto instanceof Tomate tomate) {
            System.out.println(tomate.getDataValidade());
        }

    }
}