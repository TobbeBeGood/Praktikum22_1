package hasencom.schweizfahrplan.controller;


import hasencom.schweizfahrplan.pojo.Userinput;
import hasencom.schweizfahrplan.service.Service;
import org.apache.catalina.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


public class Controller {
    @GetMapping("/connection")
    public String connection(@RequestParam Userinput userinput) {
        Service serviceobjekt = new Service();
        String speicher = serviceobjekt.getConnection(userinput);
        return speicher;
    }

    //GET-Endpoint "/connection" ✔
    //Requestparameter= Userinput ✔
    //Ruft Methode in Service auf ✔

}
