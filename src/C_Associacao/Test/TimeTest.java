package C_Associacao.Test;


import C_Associacao.Domain.Jogador;
import C_Associacao.Domain.Time;

class TimeTest {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("messi");
        Time time = new Time("santos");
        jogador.imprimi();

        jogador.setTime(time);
    }

}