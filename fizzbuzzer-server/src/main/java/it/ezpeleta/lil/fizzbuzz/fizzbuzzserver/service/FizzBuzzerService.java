package it.ezpeleta.lil.fizzbuzz.fizzbuzzserver.service;

import it.ezpeleta.lil.fizzbuzz.fizzbuzzserver.model.Number;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FizzBuzzerService {

    private static List<Number> numbers;

    public List<Number> getAllNumbers(){
        if(numbers != null){
            return numbers;
        }
        numbers = new ArrayList<>();
        boolean isMultipleOf3;
        boolean isMultipleOf5;
        for(int i=1; i<=100; i++){
            isMultipleOf3 = i%3 == 0;
            isMultipleOf5 = i%5 == 0;
            numbers.add(new Number(i,isMultipleOf3,isMultipleOf5));
        }
        return numbers;
    }
}
