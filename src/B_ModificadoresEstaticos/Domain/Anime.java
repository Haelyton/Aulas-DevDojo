package B_ModificadoresEstaticos.Domain;

import lombok.Getter;

@Getter
public class Anime {
    private String nome;
    private static int[] ep;
    static {
        System.out.println("\nBloco de inicializacao");
        ep = new int[100];
        for (int i = 0; i < ep.length; i++){
            ep[i] = 1 + i;
            System.out.print(ep[i] + " ");
        }
    }

}
