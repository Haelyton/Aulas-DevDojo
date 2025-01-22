package C_Associacao.Domain.ExercicioAssociacao.Domain;

public class Seminario {

    private String titulo;
    private Aluno[] alunos;
    private Local local;

    public Local getLocal() {
        return local;
    }

    public void setLocal(final Local local) {
        this.local = local;
    }

    public Seminario(final String titulo, final Aluno[] alunos, final Local local) {
        this.alunos = alunos;
        this.local = local;
        this.titulo = titulo;
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

    public Seminario(final String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(final String titulo) {
        this.titulo = titulo;
    }
}
