package D_Heranca.Domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Endereco {

    private String rua;
    private String cep;

    public String getCep() {
        return cep;
    }

    public void setCep(final String cep) {
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(final String rua) {
        this.rua = rua;
    }
}
