 package com.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DataJpaApplication 
{

	public static void main(String[] args)
	{
		SpringApplication.run(DataJpaApplication.class, args);
		System.out.println("DataJPA Mappings,");
	}

}
