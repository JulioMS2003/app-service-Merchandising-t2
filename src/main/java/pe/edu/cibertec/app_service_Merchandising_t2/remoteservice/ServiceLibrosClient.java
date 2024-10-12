package pe.edu.cibertec.app_service_Merchandising_t2.remoteservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "app-service-libros-t2")
public interface ServiceLibrosClient {

    @GetMapping("/libros")
    String obtenerLibros();

    @GetMapping("/libros-precio")
    String obtenerPrecio();

}
