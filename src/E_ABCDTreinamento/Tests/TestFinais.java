package E_ABCDTreinamento.Tests;

import E_ABCDTreinamento.Entity.Carro;
import E_ABCDTreinamento.Entity.Moto;

public class TestFinais {
    public static void main(String[] args) {
        System.out.println("Criando Carro");
        Carro carro = new Carro();
        carro.ligar();

        System.out.println();
        System.out.println("Criando Moto");
        Moto moto = new Moto();
        moto.ligar();
    }
}
