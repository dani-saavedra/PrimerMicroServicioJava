package co.edu.udea.proyecto.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class ProyectoController {

    @GetMapping(path = "/saludar")
    public String saludar() {
        return "Hola mundo";
    }

    @GetMapping(path = "/")
    public String despedir(){
        return "Adios";
    }
}
