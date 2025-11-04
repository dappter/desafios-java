package Animal;

import java.util.ArrayList;

public class Animal {
    private String nome;
    private String raca;
    private String sexo;

    public Animal(String nome, String raca, String sexo) {
        this.nome = nome;
        this.raca = raca;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }

    public String getSexo() {
        return sexo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

}
