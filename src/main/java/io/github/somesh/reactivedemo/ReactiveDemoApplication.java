package io.github.somesh.reactivedemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@SpringBootApplication
class ReactiveDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactiveDemoApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		Mono.just("Justin").subscribe(System.out::println);
//
//		Flux.just("Apple","Cherry").subscribe(f->System.out.println(f+"!"));
//	}
}
