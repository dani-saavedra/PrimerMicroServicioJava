package co.edu.udea.proyecto.service;

import org.springframework.stereotype.Component;

@Component
public class ProyectoFallback implements ProyectoClient {

    @Override
    public String getProject() {
        //lo que quieras hacer.
        return "Falle pero no te preocupes";
    }

    @Override
    public String otroLllamado() {
        return null;
    }
}