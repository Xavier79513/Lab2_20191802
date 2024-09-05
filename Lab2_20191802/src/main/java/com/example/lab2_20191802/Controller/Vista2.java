package com.example.lab2_20191802.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Vista2 {
    @RequestMapping(value = "/PaginaSegunda", method = RequestMethod.GET)
    public String paginaNueva2(){
        return "Pagina3";
    }
}
