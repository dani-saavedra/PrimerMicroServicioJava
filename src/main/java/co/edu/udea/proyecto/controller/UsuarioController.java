package co.edu.udea.proyecto.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/usuario")
public class UsuarioController {

    @GetMapping(path = "/consultarcuatro")
    public String consultarUsuarios(){
        //Llame a la consulta
        return "Consulte Usuarios";
    }
}
