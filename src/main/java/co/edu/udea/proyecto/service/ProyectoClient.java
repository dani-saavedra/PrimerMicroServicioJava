package co.edu.udea.proyecto.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(
        name = "proyecto",
        fallback = ProyectoFallback.class
)
public interface ProyectoClient {

    @GetMapping(path = "/proyecto/consultar")
    String getProject();


}
