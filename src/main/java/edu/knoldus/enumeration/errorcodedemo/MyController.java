package edu.knoldus.enumeration.errorcodedemo;

import edu.knoldus.enumeration.errorcodedemo.exceptions.MyException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/exception")
public class MyController {
    
    @GetMapping("/code")
    public Mono getErrorCodeWithException() {
        return Mono.fromCallable(() -> {
            throw new MyException();
        });
    }
}
