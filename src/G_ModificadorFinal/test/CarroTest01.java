package G_ModificadorFinal.test;

import G_ModificadorFinal.domain.Carro;
import G_ModificadorFinal.domain.Comprador;

class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Comprador comprador = new Comprador();
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setName("kuririn");
        System.out.println(carro.COMPRADOR);
    }

}