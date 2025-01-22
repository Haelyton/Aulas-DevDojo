package C_Associacao.Domain;

import lombok.Getter;
import lombok.Setter;

import java.sql.SQLOutput;

@Getter
@Setter
public class Jogador {

    private String nome;
    private Time time;

    public Jogador(String nome, Time time) {
        this.nome = nome;
        this.time = time;
    }

    public Jogador(final String nome) {
        this.nome = nome;
    }

    public void imprimi() {
        System.out.println(getNome());
        if (time != null) return;
        System.out.println(getNome());
    }
}
