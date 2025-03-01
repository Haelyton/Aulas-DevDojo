package K_Polimorfismo.Test;

import K_Polimorfismo.Domain.Computador;
import K_Polimorfismo.Domain.Produto;
import K_Polimorfismo.Domain.Tomate;

public class ProdutoTest02 {
    public ProdutoTest02() {
    }

    public static void main(String[] args) {
        Produto produto = new Computador("ryzen 9", 33333.0);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());
        System.out.println("-----------------------------");
        Produto produto1 = new Tomate("americano", 3.0);
        System.out.println(produto1.getNome());
        System.out.println(produto1.getValor());
        System.out.println(produto1.calcularImposto());
    }
}