package C_Associacao.Domain;

public class Escola {

    private String nome;

    public Professor[] professor;

    public Escola(final String nome, final Professor[] professor) {
        this.nome = nome;
        this.professor = professor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(final String nome) {
        this.nome = nome;
    }

    public Professor[] getProfessor() {
        return professor;
    }

    public void setProfessor(final Professor[] professor) {
        this.professor = professor;
    }

    public void imprimi() {
        System.out.println(this.getNome());
        if (professor != null) return;
        for (Professor professor1 : professor) {
            System.out.println(professor1.getNome());
        }
    }


}
