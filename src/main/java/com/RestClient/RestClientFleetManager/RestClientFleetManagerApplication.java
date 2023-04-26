package com.RestClient.RestClientFleetManager;

import com.RestClient.RestClientFleetManager.CarDTO.CarDTO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Application implements CommandLineRunner {
		private RestTemplate restTemplate = new RestTemplate();
		private String serverUrl = "http://localhost:8080/cars";


	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}



	@Override
	public void run(String... args) throws Exception {
		restTemplate.postForLocation(serverUrl, new CarDTO(("Toyota","Sedan", "ABC123", 2022, 30000.0, true));
		restTemplate.postForLocation(serverUrl, new CarDTO(("Honda", "Hatchback", "DEF456",2021,25000.0, false));
		restTemplate.postForLocation(serverUrl, new CarDTO(("Ford", "SUV", "GHI789", 2022, 35000.0, true));
		restTemplate.postForLocation(serverUrl, new CarDTO(("Chevrolet", "Pickup", "JKL012",2021, 40000.0, true));
		restTemplate.postForLocation(serverUrl, new CarDTO(("Nissan", "Coupe", "MNO345",2022, 38000.0, true));
		restTemplate.postForLocation(serverUrl, new CarDTO(("Toyota","Sedan", "ABC123", 2022, 30000.0, true));
		restTemplate.postForLocation(serverUrl, new CarDTO(("Mazda", "Sedan", "PQR678", 2021, 29000.0, true));
		restTemplate.postForLocation(serverUrl, new CarDTO(("Kia", "Crossover", "STU901", 2022, 32000.0, true));
		restTemplate.postForLocation(serverUrl, new CarDTO(("Hyundai", "Sedan", "VWX234", 2021, 27000.0, false);
		restTemplate.postForLocation(serverUrl, new CarDTO(("Chevrolet", "Pickup", "JKL012",2021, 40000.0, true));
		restTemplate.postForLocation(serverUrl, new CarDTO(("Subaru", "Wagon", "YZA567", 2022, 31000.0, true));
		restTemplate.postForLocation(serverUrl, new CarDTO(("BMW", "Sedan", "BCD890",2021,45000.0, true));

	}
}

}
