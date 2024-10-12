package pe.edu.cibertec.app_service_Merchandising_t2.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.app_service_Merchandising_t2.remoteservice.ServiceEventosClient;
import pe.edu.cibertec.app_service_Merchandising_t2.remoteservice.ServiceLibrosClient;

@RequiredArgsConstructor
@RestController
public class GestionMerchandisingController {

    private final ServiceEventosClient serviceEventosClient;
    private final ServiceLibrosClient serviceLibrosClient;

    @GetMapping("/merchandising")
    public String obtenerMerchandising(){
        return "Lista de Merchandising de Wigetta";
    }

    @GetMapping("/merchandising-tipo")
    public String obtenerTipo(){
        return "Tipo de Merchandising de Wigetta";
    }

    @GetMapping("/merchandising-eventos")
    public String obtenerEventos(){
        return serviceEventosClient.obtenerEventos();
    }

    @GetMapping("/merchandising-libros")
    public String obtenerLibros(){
        return serviceLibrosClient.obtenerLibros();
    }

    @GetMapping("/merchandising-libros-precio")
    public String obtenerPrecio(){
        return serviceLibrosClient.obtenerPrecio();
    }

}
