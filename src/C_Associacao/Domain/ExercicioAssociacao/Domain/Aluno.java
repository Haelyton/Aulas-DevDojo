package C_Associacao.Domain.ExercicioAssociacao.Domain;

public class Aluno {

    private String nome;
    private int idade;

    public Aluno(final Seminario seminario) {
        this.seminario = seminario;
    }

    private Seminario seminario;

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(final Seminario seminario) {
        this.seminario = seminario;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(final int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(final String nome) {
        this.nome = nome;
    }

    public Aluno(final String nome, final int idade) {
        this.nome = nome;
        this.idade = idade;
    }

}
