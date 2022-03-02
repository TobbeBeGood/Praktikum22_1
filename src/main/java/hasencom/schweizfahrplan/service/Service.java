package hasencom.schweizfahrplan.service;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@org.springframework.stereotype.Service
public class Service {


   private static HttpURLConnection connection;
    //Methode die HTTP GET Request an SChweiz API sendet
    // Parameter ist Eingabe des Nutzers (Userinput)
    //GET http://transport.opendata.ch/v1/connections?from=Lausanne&to=Genève
    //Ausgabe des zurückkommenden JSOn auf der Konsole

    //Methode, die die Ziel URL aus der API URL und den Eingaben des Nutzers zusammen setzt
    public String getConnection() throws Exception {
            BufferedReader reader;
            String line;
            StringBuffer responseContent = new StringBuffer();

            try{
                 URL url= new URL("http://transport.opendata.ch/v1/connections?from=Lausanne&to=Genève");
                 connection = (HttpURLConnection) url.openConnection();

                 connection.setRequestMethod("GET");
                 connection.setConnectTimeout(5000);
                 connection.setReadTimeout(5000);

                 int status = connection.getResponseCode();
                 //System.out.println(status);

                reader = new BufferedReader(new InputStreamReader( (connection.getInputStream())));
                while ((line=reader.readLine())!= null){
                    responseContent.append(line);
                }
                reader.close();

            }    catch (Exception e) {
                }
            connection.disconnect();
            return responseContent.toString();
        }

       /* HttpClient client =HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://transport.opendata.ch/v1/connections?from=Lausanne&to=Genève"))
                .build();
       client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::body)
                .thenAccept(System.out::println)
                .join();*/

    }



