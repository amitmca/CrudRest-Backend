package br.com.restapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.restapi.models.User;
import br.com.restapi.repository.UserRepository;

@SpringBootApplication
public class CrudRestBackendApplication implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(CrudRestBackendApplication.class, args);
	}
	

	@Override
	public void run(String... args) throws Exception {
		userRepository.save(new User("Phyton", "junior"));
		userRepository.save(new User("Java", "junior"));
		userRepository.save(new User("C#", "junior"));
	}
}
