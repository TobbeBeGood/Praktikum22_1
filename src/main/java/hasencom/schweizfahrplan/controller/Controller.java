package hasencom.schweizfahrplan.controller;


import hasencom.schweizfahrplan.pojo.Userinput;
import hasencom.schweizfahrplan.service.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@org.springframework.stereotype.Controller
public class Controller {
    @GetMapping("/connection")
    public String index() throws Exception {
        Service service = new Service();
         String result=service.getConnection();

        return result;
    }


    //GET-Endpoint "/connection"
    //Requestparameter= Userinput
    //Ruft Methode in Service auf


}
