package Produto;

import java.util.ArrayList;

public class Main {



    public static void main(String[] args) {
        Produto produto1 = new Produto("Nescal",12.99);
        Produto produto2 = new Produto("Toddy", 10.99);
        Produto produto3 = new Produto("Nutella", 12.99);
        Produto produto4 = new Produto("Nestle", 2.99);

        ArrayList<Produto> listaDeProdutos = new ArrayList<>();
        listaDeProdutos.add(produto1);
        listaDeProdutos.add(produto2);
        listaDeProdutos.add(produto3);
        listaDeProdutos.add(produto4);

        double somaPrecos = 0;

        for (Produto produto : listaDeProdutos){
            somaPrecos += produto.getPreco();
        }

        double precoMedio = somaPrecos / listaDeProdutos.size();

        System.out.println("Média dos preços = " + precoMedio);

    }
}
