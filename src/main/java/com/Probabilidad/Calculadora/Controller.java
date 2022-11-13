package com.Probabilidad.Calculadora;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
    @RequestMapping (value = "index")
    public String index(){
        return "index";
    }

}
