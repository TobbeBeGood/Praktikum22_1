package hasencom.schweizfahrplan.controller;


import hasencom.schweizfahrplan.pojo.APIrespond;
import hasencom.schweizfahrplan.pojo.Userinput;
import hasencom.schweizfahrplan.service.Service;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@org.springframework.stereotype.Controller
public class Controller {


    @GetMapping("/connection")
    public ResponseEntity<?> getJSON(Userinput input) throws Exception {

        Service service = new Service();
        APIrespond response=new APIrespond();
        response=service.getConnection(input.getStart_stadt(),input.getZiel_stadt());
        return new ResponseEntity(response, HttpStatus.OK);
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
    @GetMapping("/fahrplan")
    String getFormular(Model model) {
        model.addAttribute("something","Schweiz Fahrplan");
        model.addAttribute("formular.html");
        model.addAttribute("start_stadt","ziel_stadt");
        System.out.println("Seite /formular Aufgerufen");
        return "formular.html";
    }


    //GET-Endpoint "/connection"
    //Requestparameter= Userinput
    //Ruft Methode in Service auf


}
