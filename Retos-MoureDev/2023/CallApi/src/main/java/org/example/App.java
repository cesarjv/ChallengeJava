package org.example;
import com.google.common.base.Charsets;
import com.google.common.hash.Hashing;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import java.sql.Timestamp;

/**
 * /*
 *  * Llamar a una API es una de las tareas más comunes en programación.
 *  *
 *  * Implementa una llamada HTTP a una API (la que tú quieras) y muestra su
 *  * resultado a través de la terminal. Por ejemplo: Pokémon, Marvel...
 *  *
 *  * Aquí tienes un listado de posibles APIs:
 *  * https://github.com/public-apis/public-apis
 *
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try {

            HttpRequest getRequest= HttpRequest.newBuilder().uri(URI.create(getConnectionUrl())).build();
            HttpClient httpClient=HttpClient.newHttpClient();
            HttpResponse<String> response=httpClient.send(getRequest, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body());

        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static String getConnectionUrl(){
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        String ts= String.valueOf(timestamp.getTime());
        String publicKey="a8126f8821360a0f79b8acd315af4978";
        String privatekey="7dfca1be7330141af82c21fdeef4e7a64c363c31";
        StringBuilder hash=new StringBuilder();
        hash.append(ts).append(privatekey).append(publicKey);
        String md5 = String.valueOf(Hashing.md5().hashString(hash, Charsets.UTF_8));
        StringBuilder uri=new StringBuilder();
        uri.append("https://gateway.marvel.com/v1/public/creators?").append("ts=").append(ts).append("&").append("apikey=").append(publicKey).append("&").append("hash=").append(md5);
        return uri.toString();
    }
}
