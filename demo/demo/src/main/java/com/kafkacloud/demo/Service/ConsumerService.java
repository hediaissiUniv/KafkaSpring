package com.kafkacloud.demo.Service;

import java.util.Date;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.kafkacloud.demo.Entities.PageEvent;

@Service
public class ConsumerService {
    @Bean
    public Consumer<PageEvent> pageEventConsummer(){
        return (input) ->{
            System.out.println("-------------------------");
            System.out.println(input.toString());
            System.out.println("-------------------------");
        };
    }
    @Bean 
    public Supplier<PageEvent> pageEventSupplier(){
        return () -> new PageEvent(Math.random()>0.5 ?"P1" : "P2",Math.random()>0.5 ?"U1" : "U2"  , new Date(), new Random().nextInt(9000));
        
    }
    @Bean 
    public Function<PageEvent,PageEvent> pageEventFunction(){
        return (input) -> 
            {   input.setUser("UUUUUUU");
                return input;
            };
        }
}
