package co.edu.udea.proyecto.controller;

import co.edu.udea.proyecto.service.ProyectoClient;
import co.edu.udea.proyecto.service.PruebaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/usuario")
public class UsuarioController {

    //Las anotaciones funcionan gracias a Programacion orientada a aspectos AOP

    @Autowired
    private ProyectoClient proyecto;

    @Autowired
    private PruebaService service;

    @GetMapping(path = "/consultar")
    public String consultarUsuarios(){
        //Llame a la consulta

        //LoadBalancer
        String project = proyecto.getProject();
        return "Consulte Usuarios, la respuesta del cliente feing fue "+project;
    }

    @GetMapping(path = "/xxx")
    public String xxx(){
        service.saludar();
        return "xx";
    }
}
