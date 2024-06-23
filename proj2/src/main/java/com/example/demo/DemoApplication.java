package com.example.demo;

import com.example.demo.models.Product;
import com.google.gson.Gson;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		// link to maven site-
		// https://central.sonatype.com/?smo=true

		// https://mvnrepository.com/

		SpringApplication.run(DemoApplication.class, args);

		Product product = new Product("Laptop", 999.99, 10);

		System.out.println(product);

		Gson gson = new Gson();
		String json = gson.toJson(product);
		System.out.println(json);
	}

}
