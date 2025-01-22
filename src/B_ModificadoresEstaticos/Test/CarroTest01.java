package B_ModificadoresEstaticos.Test;

import B_ModificadoresEstaticos.Domain.Carro;

class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro("BMW", 325);
        Carro carro2 = new Carro("Porsche", 325);
        Carro carro3 = new Carro("R34", 325);

        carro.setVelocidadeMaxima(180);
        Carro.setVelocidadeLimite(100);

        carro.imprimi();
        carro2.imprimi();
        carro3.imprimi();

        if (carro.getVelocidadeMaxima() > Carro.getVelocidadeLimite()){
            System.out.println("Multa por velocidade ultrapassada");
        }
    }
}