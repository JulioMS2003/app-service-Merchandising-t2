package pe.edu.cibertec.app_service_Merchandising_t2.remoteservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "app-service-Eventos-t2")
public interface ServiceEventosClient {

    @GetMapping("/eventos")
    String obtenerEventos();

}
