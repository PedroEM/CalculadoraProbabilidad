package com.Probabilidad.Calculadora.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    
    @RequestMapping (value = "index")
    public String index(){
        return "index";
    }

    @RequestMapping (value = "hipergeometrica")
    public String Hipergeometrica(){
        return "hipergeometrica";
    }

}