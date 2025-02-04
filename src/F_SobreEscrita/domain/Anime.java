package F_SobreEscrita.domain;

public class Anime {

    private String nome;

    @Override
    public String toString() {
        return "Anime: " + this.nome;
    }

    public Anime(final String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(final String nome) {
        this.nome = nome;
    }
}
