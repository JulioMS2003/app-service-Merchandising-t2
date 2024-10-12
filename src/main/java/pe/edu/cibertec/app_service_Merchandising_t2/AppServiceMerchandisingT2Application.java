package pe.edu.cibertec.app_service_Merchandising_t2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AppServiceMerchandisingT2Application {

	public static void main(String[] args) {
		SpringApplication.run(AppServiceMerchandisingT2Application.class, args);
	}

}
