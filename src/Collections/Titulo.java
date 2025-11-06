package Collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Titulo implements Comparable<Titulo> {
    public String nome;

    public static void main(String[] args) {

        List<String> nome = new LinkedList<>();
        nome.add("A Cabana");
        nome.add("Molusco do mar");
        nome.add("Seda");
        nome.add("Crocrodille");
        nome.add("Bom Jorge");
        nome.add("Zelda");

        Collections.sort(nome);

        System.out.println(nome);
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.nome.compareTo(outroTitulo.nome);
    }

}
