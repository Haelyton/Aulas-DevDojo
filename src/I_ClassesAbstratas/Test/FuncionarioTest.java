package I_ClassesAbstratas.Test;

import I_ClassesAbstratas.Domain.DesenvolvedorDvd;
import I_ClassesAbstratas.Domain.Gerente;

class FuncionarioTest {
    FuncionarioTest() {
    }

    public static void main(String[] args) {
        Gerente gerente = new Gerente("zoro", 5000.0);
        DesenvolvedorDvd desenvolvedorDvd = new DesenvolvedorDvd("Tomioka", 10000.0);
        System.out.println(gerente);
        System.out.println(desenvolvedorDvd);
        gerente.imprimi();
        desenvolvedorDvd.imprimi();
    }
}