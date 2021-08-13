package it.ezpeleta.lil.crl.roomcrl;

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

//CommandLineRunner -> this application will only call the GET /api/rooms of RoomWebApplication and log the response.
//Before start you need to run the RoomWebApplication
@SpringBootApplication
public class RoomCrlApplication {
    private static final Logger LOG = LoggerFactory.getLogger(RoomCrlApplication.class);

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder){
        return builder.build();
    }

    @Bean
    public CommandLineRunner run(RestTemplate restTemplate){
        return  args -> {
            LOG.info("starting CLR application");
            ResponseEntity<List<Room>> rooms = restTemplate.exchange("http://localhost:8080/api/rooms",
                    HttpMethod.GET,
                    null,
                    new ParameterizedTypeReference<>() {
                    });
            rooms.getBody().forEach( room ->{
                LOG.info(room.toString());
            });
            LOG.info("finishing CLR application");
        };
    }
    public static void main(String[] args) {
        SpringApplication.run(RoomCrlApplication.class, args);
    }


}
