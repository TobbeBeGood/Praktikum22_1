package hasencom.schweizfahrplan.controller;


import hasencom.schweizfahrplan.pojo.Userinput;
import org.springframework.web.bind.annotation.GetMapping;


public class Controller {
    @GetMapping("/connection")
    public String index() {
        return "start";
    }

    //GET-Endpoint "/connection"
    //Requestparameter= Userinput
    //Ruft Methode in Service auf


}
