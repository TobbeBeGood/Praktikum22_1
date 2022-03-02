package hasencom.schweizfahrplan.service;

import hasencom.schweizfahrplan.controller.Controller;
import hasencom.schweizfahrplan.pojo.Userinput;
import org.apache.catalina.User;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Service {
    public String getConnection(Userinput userinput){
        var client = HttpClient.newHttpClient();
        var request = HttpRequest.newBuilder(
                URI.create("http://transport.opendata.ch/v1/connections?from="+ userinput.getStart_stadt()+"to="+userinput.getZiel_stadt()))
                .header("accept","application/json")
                .build();
        HttpResponse<String> response = client.send(request);
        return response.body();
    }

    //Methode die HTTP GET Request an SChweiz API sendet ✔
    // Parameter ist Eingabe des Nutzers (Userinput) ✔
    //GET http://transport.opendata.ch/v1/connections?from=Lausanne&to=Genève ✔
    //Ausgabe des zurückkommenden JSOn auf der Konsole ✘

    //Methode, die die Ziel URL aus der API URL und den Eingaben des Nutzers zusammen setzt ✘

}
