package org.example;

import org.example.entity.*;
import org.springframework.web.reactive.function.client.WebClient;

public class App {

	public static void main(String[] args) {

		/* 
		System.out.println("Exercicio 8");

		Flux.just(1,2,3,4,5,6,5,4,3,2)
			.buffer(2)
			.filter(p -> p.get(0) > p.get(1))
			.flatMapIterable(Function.identity())
			.subscribe(System.out::println); //passagem de uma funcao sem argumentos (scope) 

		*/

		String BASE_URL = "http://localhost:8080";
		String MY_URI = "/media";

		WebClient.create(BASE_URL)
				.get()
				.uri(MY_URI)
				.retrieve()
				.bodyToFlux(Media.class)
				.subscribe(System.out::println);


		try{

			Thread.sleep(10*1000);

		}catch (InterruptedException e) {

			System.out.println("Time out");
		}


	}	
}
