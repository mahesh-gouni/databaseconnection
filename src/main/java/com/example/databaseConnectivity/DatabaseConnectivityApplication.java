package com.example.databaseConnectivity;

import com.example.databaseConnectivity.plainJPA.EntityClass;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DatabaseConnectivityApplication {

	public static void main(String[] args) {
		SpringApplication.run(DatabaseConnectivityApplication.class, args);
	}

	@Bean
	public CommandLineRunner run(EntityManagerFactory entityManagerFactory) {
		return args -> {
			EntityManager entityManager = entityManagerFactory.createEntityManager();
			entityManager.getTransaction().begin();

			// Create a new user
			EntityClass dev = new EntityClass();
			dev.setEmployeeName("gouni");
			dev.setAge(55);
			dev.setDepartmentID(507);
			dev.setGmail("gounimahesh9000@gmail.com");
			dev.setSalary(49949.98);
			dev.setLocation("khammam");

			// Persist the user
			entityManager.persist(dev);

			// Commit the transaction
			entityManager.getTransaction().commit();

			// Retrieve and print the user
			EntityClass retrievedUser = entityManager.find(EntityClass.class, dev.getEmployeeID());
			System.out.println("Retrieved User: " + retrievedUser.getEmployeeName());

			// Close EntityManager
			entityManager.close();
		};
	}
}


