package Exception;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Github {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome de usuário do GitHub para consultar informações: ");
        String username = scanner.nextLine();

        String endereco = "https://api.github.com/users/" + username;

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .header("Accept", "application/vnd.github.v3+json")
                    .build();
            HttpResponse<String> response = client
                    .send(request,HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 404){
                throw new ErroConsultaGitHubExeption("Usuário não encontrado no GitHub.");
            }

            String json =response.body();
            System.out.println(json);

        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ErroConsultaGitHubExeption e){
            System.out.println(e.getMessage());
        }
    }
}
