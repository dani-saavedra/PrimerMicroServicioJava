package co.edu.udea.proyecto.service;

import org.springframework.stereotype.Component;

@Component
public class PruebaService implements IPruebaService {

    @Override
    public void saludar(){
        System.out.println("Saludando");
    }
}
