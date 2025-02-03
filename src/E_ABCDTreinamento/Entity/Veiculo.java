package E_ABCDTreinamento.Entity;

public class Veiculo {

    private Motor motor;

    public Veiculo(){
        motor = new Motor();
        System.out.println("Veiculo criado com motor de " +
                motor.getPotencia() + " cavalos de potencia");
    }

    public void ligar(){
        System.out.println("Motor Ligado");
    }
}
