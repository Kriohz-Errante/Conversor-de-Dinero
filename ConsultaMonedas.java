import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMonedas {
    public Monedas buscarMonedas(String monedaBase, String monedaDestino, double valorAConvertir){
        String apiKey = CredencialApi.getApiKey();
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/" + apiKey + "/pair/" + monedaBase + "/"+ monedaDestino + "/" + valorAConvertir);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        HttpResponse<String> response;

        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
        }catch(Exception e){
            throw new RuntimeException("No se encontró la moneda ingresada");
        }
        return new Gson().fromJson(response.body(), Monedas.class);
    }
}
