package tn.esprit.cosharemshoussem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CoShareMsHoussemApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoShareMsHoussemApplication.class, args);
    }

}
