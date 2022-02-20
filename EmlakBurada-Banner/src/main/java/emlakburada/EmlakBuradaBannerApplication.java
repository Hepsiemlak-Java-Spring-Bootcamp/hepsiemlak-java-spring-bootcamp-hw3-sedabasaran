package emlakburada;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class EmlakBuradaBannerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmlakBuradaBannerApplication.class, args);
	}

}
