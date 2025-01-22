package C_Associacao.Test;

import C_Associacao.Domain.Jogador;

import static org.junit.jupiter.api.Assertions.*;

class JogadorTest {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("pele");
        Jogador jogador2 = new Jogador("kafu");
        Jogador jogador3 = new Jogador("ney");
        Jogador[] jogadores = {jogador1, jogador2, jogador3};

        for (Jogador jogador : jogadores) {
            jogador.imprimi();
        }

    }

}