package C_Associacao.Test;

import C_Associacao.Domain.Jogador;
import C_Associacao.Domain.Time;


public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("pele");
        Jogador jogador2 = new Jogador("cafu");
        Time time = new Time("Brasil");
        Jogador[] jogadores = {jogador1, jogador2};

        jogador1.setTime(time);//referencia para o objeto time
        jogador2.setTime(time);//referencia para o objeto time
        time.setJogador(jogadores);//

        jogador1.imprimi();
        jogador2.imprimi();
        time.imprimi();
    }
}
