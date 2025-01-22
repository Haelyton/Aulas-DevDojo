package C_Associacao.Domain.ExercicioAssociacao.Domain;

public class Professor {

    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(final String especialidade, final String nome, final Seminario[] seminarios) {
        this.especialidade = especialidade;
        this.nome = nome;
        this.seminarios = seminarios;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(final Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public Professor(final Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public Professor(final String nome, final String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(final String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(final String especialidade) {
        this.especialidade = especialidade;
    }

    public void imprimi(){
        System.out.println(this.getNome());
        if (this.seminarios == null) return;
        for (Seminario seminario : seminarios) {
            System.out.println("Seminarios Disponiveis: " + seminario.getTitulo());
            System.out.println("Local: " + seminario.getLocal().getEndereco());
            if (seminario.getAlunos() == null) continue;
            for (Aluno aluno : seminario.getAlunos()){
                System.out.println("Alunos: " + aluno.getNome() + " Idade: " + aluno.getIdade());
            }
        }
    }
}
