package it.ezpeleta.lil.fizzbuzz.fizzbuzzserver.controller;

import it.ezpeleta.lil.fizzbuzz.fizzbuzzserver.model.Number;
import it.ezpeleta.lil.fizzbuzz.fizzbuzzserver.service.FizzBuzzerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/fizz-buzzer")
public class FizzBuzzerController {

    private final FizzBuzzerService fizzBuzzerService;

    public FizzBuzzerController(FizzBuzzerService fizzBuzzerService) {
        this.fizzBuzzerService = fizzBuzzerService;
    }

    @GetMapping
    public List<Number> getAllNumbers(){
        return fizzBuzzerService.getAllNumbers();
    }
}
