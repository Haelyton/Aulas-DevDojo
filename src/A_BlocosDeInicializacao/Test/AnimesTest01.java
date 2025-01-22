package A_BlocosDeInicializacao.Test;

import A_BlocosDeInicializacao.domain.Anime;

class AnimesTest01 {
    public static void main(String[] args) {
        Anime animes = new Anime("One piece");

        for (int episodio : animes.getEp()){
            System.out.print(episodio + " ");
        }
    }
}