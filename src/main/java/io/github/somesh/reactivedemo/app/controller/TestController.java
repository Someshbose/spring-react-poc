package io.github.somesh.reactivedemo.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class TestController {

    @GetMapping("/{id}")
    public Mono<String> tacoById(@PathVariable("id") int id) {
        return Flux.just("Apple","Ball","Canary","Deamon","Eagle","Jerry").elementAt(id);
    }
}
