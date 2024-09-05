package com.example.lab2_20191802.Controller;


import ch.qos.logback.core.model.Model;
import com.example.lab2_20191802.Beans.Autos;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class Principal {

    @RequestMapping(value = "/PaginaPrimera", method = RequestMethod.GET)
    public String paginaNueva(){
        return "Pagina1";
    }
    @GetMapping(value = "/datos")
    public String listaAuto(Model model){
        ArrayList<Autos> listaAuto = new ArrayList<>();
        listaAuto.add(new Autos());
        return "Pagina2";
    }
    @PostMapping("/guardar/auto")
    public String guardarAuto(Autos autos){
        System.out.println("Modelo: " + autos.getModelo());
        System.out.println("Color: " + autos.getColor());
        System.out.println("Kilometraje: "+ autos.getKilometraje());
        System.out.println("Costo por día: "+autos.getCosto_dia());
        System.out.println("Sede: "+autos.getId_sede());
    return "Pagina2";
    }
}