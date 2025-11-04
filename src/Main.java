import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Produto produto1 = new Produto("queijo", 14.29, 10);
        Produto produto2 = new Produto("desinfetante", 23.80, 10);

        ArrayList<Produto> listaDeProdutos = new ArrayList<>();
        listaDeProdutos.add(produto1);
        listaDeProdutos.add(produto2);
        System.out.println("Tamanho da lista = " + listaDeProdutos.size());
        System.out.println("Produto na posição 1 = " + listaDeProdutos.get(0));

        for (Produto produto : listaDeProdutos) {
               System.out.println(produto);
        }

        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel("queijo", 14.29, 10, "10/11/2006");
        System.out.println(produtoPerecivel);
    }
}