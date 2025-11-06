package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class List {

    public static void main(String[] args) {
        ArrayList<Integer> numInteiro = new ArrayList<>();
        numInteiro.add(6);
        numInteiro.add(3);
        numInteiro.add(2);
        numInteiro.add(5);
        numInteiro.add(7);

        Collections.sort(numInteiro);
        System.out.println(numInteiro);
    }
}
