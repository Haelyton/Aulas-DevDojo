package C_Associacao.Test;

import C_Associacao.Domain.Escola;
import C_Associacao.Domain.Professor;


class EscolaTest {
    public static void main(String[] args) {
        Professor professor = new Professor("jiraya");
        Professor[] professores = {professor};
        Escola escola = new Escola("Afonsina", professores);

        escola.imprimi();
    }

}