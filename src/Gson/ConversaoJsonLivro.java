package Gson;

import com.google.gson.Gson;

public class ConversaoJsonLivro {
    public static void main(String[] args) {
        String livroJson = "{\"titulo\":\"Aventuras do Java\",\"autor\":\"Akemi\",\"editora\":{\"nome\":\"TechBooks\",\"cidade\":\"São Paulo\"}}";

        Gson gson = new Gson();
        Livro livro = gson.fromJson(livroJson, Livro.class);

        Editora editora = gson.fromJson(livroJson, Editora.class);

        System.out.println("Objeto livro: " + livro);
        System.out.println("Objeto editora: " + editora);


    }
}
