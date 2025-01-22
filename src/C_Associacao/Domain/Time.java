package C_Associacao.Domain;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Time {

    private String nome;
    private Jogador[] jogador;

    public Time(String nome, Jogador[] jogador) {
        this.jogador = jogador;
        this.nome = nome;
    }

    public Time(final String nome) {
        this.nome = nome;
    }

    public void imprimi(){
        System.out.println(getNome());
        if (jogador != null) return;
        for (Jogador jogador1 : jogador) {
            System.out.println(jogador1.getNome());
        }
    }

}
