import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Conversion {
   public String monedaInicial;
   public String monedaFinal;
   public Double valor;
   private Double valorFinal;

    public Conversion (String monedaInicial,String monedaFinal, Double valor) throws IOException, InterruptedException {

        this.monedaInicial = monedaInicial;
        this.monedaFinal = monedaFinal;
        this.valor = valor;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://v6.exchangerate-api.com/v6/17426a44d9a15240b9a8fde8/pair/"+this.monedaInicial+"/"+this.monedaFinal+"/"+this.valor
                ))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        Gson gson = new Gson();
        String json = response.body();
        MonedaAPI monedaAPI = gson.fromJson(json, MonedaAPI.class);
        this.valorFinal = Double.valueOf(monedaAPI.conversion_result());
    }

    public Double getValorFinal() {
        return valorFinal;
    }
}
