package ArrayList;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<String> lista =new ArrayList<>();
        lista.add("oi");
        lista.add("tudo");
        lista.add("bem");

        for (String elemento : lista){
            System.out.println(elemento);
        }
    }
}
