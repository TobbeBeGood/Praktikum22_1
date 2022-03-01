package hasencom.schweizfahrplan.service;

import hasencom.schweizfahrplan.controller.Controller;
import hasencom.schweizfahrplan.pojo.Userinput;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;

public class Service {
    public String getConnection(Userinput userinput){
        var client = HttpClient.newHttpClient();
        var request = HttpRequest.newBuilder(
                URI.create("http://transport.opendata.ch/v1/connections?from=Lausanne&to=Genève"))
                .header("accept","applicatin/json")
                .build();
        return "";
    }
    //Methode die HTTP GET Request an SChweiz API sendet ✘
    // Parameter ist Eingabe des Nutzers (Userinput) ✔
    //GET http://transport.opendata.ch/v1/connections?from=Lausanne&to=Genève ✘
    //Ausgabe des zurückkommenden JSOn auf der Konsole ✘

    //Methode, die die Ziel URL aus der API URL und den Eingaben des Nutzers zusammen setzt ✘

}
