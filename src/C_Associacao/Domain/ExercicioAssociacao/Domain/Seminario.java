package C_Associacao.Domain.ExercicioAssociacao.Domain;

public class Seminario {

    private String titulo;
    private Aluno[] alunos;
    private Local local;

    public Seminario(final String comoSerUmPirata, final Aluno[] alunos, final Local local) {
    }

    public Local getLocal() {
        return local;
    }

    public Seminario(final String titulo, Local local) {

        this.titulo = titulo;
        this.local = local;
    }

    public void setLocal(final Local local) {
        this.local = local;
    }

    public Seminario(final Aluno[] alunos, final String titulo) {
        this.alunos = alunos;
        this.titulo = titulo;
    }

    public void setAlunos(final Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(final String titulo) {
        this.titulo = titulo;
    }
}
