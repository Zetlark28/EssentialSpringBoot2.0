package it.ezpeleta.lil.fizzbuzz.fizzbuzzercrl;


import it.ezpeleta.lil.fizzbuzz.fizzbuzzercrl.model.Number;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@SpringBootApplication
public class FizzbuzzerCrlApplication {

    private static final Logger log = LoggerFactory.getLogger(FizzbuzzerCrlApplication.class);

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder){
        return builder.build();
    }

    @Bean
    public CommandLineRunner run(RestTemplate restTemplate){
        return args -> {
            log.info("Start commandLineRunner");
            ResponseEntity<List<Number>> result = restTemplate.exchange("http://localhost:8080/api/fizz-buzzer",
                    HttpMethod.GET,
                    null,
                    new ParameterizedTypeReference<>(){});
            if(result.getBody() != null) {
                for (Number n : result.getBody()) {
                    if(n.getMessage() != null) {
                        log.info(n.getMessage());
                    }
                }
            }
            log.info("Finish commandLineRunner");

        };
    }

    public static void main(String[] args) {
        SpringApplication.run(FizzbuzzerCrlApplication.class, args);
    }

}
