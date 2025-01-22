package C_Associacao.Test.ExercicioAssociacaoTest.Test;

import C_Associacao.Domain.ExercicioAssociacao.Domain.Aluno;
import C_Associacao.Domain.ExercicioAssociacao.Domain.Local;
import C_Associacao.Domain.ExercicioAssociacao.Domain.Professor;
import C_Associacao.Domain.ExercicioAssociacao.Domain.Seminario;

public class AssociacaoTest {
    public static void main(String[] args) {
        Local local = new Local(("Rua dos Banseiros"));
        Aluno aluno = new Aluno("Zoro", 20);
        Aluno aluno1 = new Aluno("Luffy", 21);
        Aluno[] alunos = {aluno, aluno1};
        Professor professor = new Professor("Geraldo", "Matemática");
        Seminario seminario = new Seminario("Como ser um pirata", alunos, local);
        Seminario[] seminarios = {seminario};

        professor.setSeminarios(seminarios);

        professor.imprimi();

    }
}
