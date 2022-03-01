package hasencom.schweizfahrplan.controller;


import hasencom.schweizfahrplan.pojo.Userinput;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class Controller {
    @GetMapping("/connection")
    public String index() {
        return "start";
    }
    @RequestMapping(value = "/connections",method = RequestMethod.GET)
    public String windex() {
        return "cool";
    }

    //GET-Endpoint "/connection"
    //Requestparameter= Userinput
    //Ruft Methode in Service auf


}
