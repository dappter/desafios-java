package Collections;

import java.util.LinkedList;
import java.util.List;

public class ArrayList {

    public static void main(String[] args) {
        List<String> listaArrayList = new java.util.ArrayList<>();
        listaArrayList.add("A");
        listaArrayList.add("B");
        listaArrayList.add("C");

        System.out.println(listaArrayList);

        List<String> listaLinkedList = new LinkedList<>();
        listaLinkedList.add("C");
        listaLinkedList.add("D");
        listaLinkedList.add("E");

        System.out.println(listaLinkedList);

        List<String> polimorfismo;

        polimorfismo = new java.util.ArrayList<>();
        polimorfismo.add("Teste de polimorfismo - A");
        polimorfismo.add("Teste de polimorfismo - B");

        System.out.println("Usando ArrayList = " + polimorfismo);

        polimorfismo = new LinkedList<>();
        polimorfismo.add("Teste de polimorfismo - C");
        polimorfismo.add("Teste de polimorfismo - D");

        System.out.println("Usando LinkedList = " + polimorfismo);







    }

}