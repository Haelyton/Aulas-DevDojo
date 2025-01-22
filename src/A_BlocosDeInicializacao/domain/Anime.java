package A_BlocosDeInicializacao.domain;

import lombok.Getter;

@Getter
public class Anime {
    private String nome;
    private int[] ep;
    {
        System.out.println("Bloco de inicializacao");
        ep = new int[100];
        for (int i = 0; i < ep.length; i++){
            ep[i] = 1 + i;
        }
    }
    public Anime(String nome) {
        this.nome = nome;
    }

}
