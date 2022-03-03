package hasencom.schweizfahrplan.controller;


import hasencom.schweizfahrplan.pojo.Userinput;
import hasencom.schweizfahrplan.service.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@org.springframework.stereotype.Controller
public class Controller {
    @GetMapping("/connection")
    public String index(Model model) throws Exception {
        model.addAttribute("something","Schweiz Fahrplan");
        Service service = new Service();
        String result=service.getConnection();
        System.out.println("Seite /Connection aufgerufen");
        return result;
    }
    @GetMapping("/")
    String getFahrplan(Model model) {
        model.addAttribute("something","Schweiz Fahrplan");
        model.addAttribute("fahrplan.html");
        System.out.println("Seite Aufgerufen");
        return "fahrplan";
    }
    @GetMapping("/impressum")
    String getImpressum(Model model) {
        model.addAttribute("impressum.html");
        System.out.println("Seite /impressum Aufgerufen");
        return "impressum.html";
    }


    //GET-Endpoint "/connection"
    //Requestparameter= Userinput
    //Ruft Methode in Service auf


}
