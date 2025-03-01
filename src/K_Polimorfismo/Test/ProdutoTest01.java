package K_Polimorfismo.Test;

import K_Polimorfismo.Service.CalcularImpostos;
import K_Polimorfismo.Domain.Computador;
import K_Polimorfismo.Domain.Televisao;
import K_Polimorfismo.Domain.Tomate;

public class ProdutoTest01 {
    public ProdutoTest01() {
    }

    public static void main(String[] args) {
        Computador computador = new Computador("Gamer", 5000.0);
        Tomate tomate = new Tomate("tomataoo", 2.0);
        Televisao televisao = new Televisao("Samsunga", 3000.0);
        CalcularImpostos.calcularImpostoProduto(computador);
        System.out.println("--------------------------------");
        CalcularImpostos.calcularImpostoProduto(tomate);
        System.out.println("--------------------------------");
        CalcularImpostos.calcularImpostoProduto(televisao);
    }
}