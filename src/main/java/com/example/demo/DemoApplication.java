package com.example.demo;


import com.example.demo.DAO.RoleRepository;
import com.example.demo.DAO.UtilisateurRepository;
import com.example.demo.entities.Role;
import com.example.demo.entities.Utilisateur;
import com.example.demo.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	private UtilisateurRepository utilisateurRepository;
	@Autowired
	private RoleRepository rolesRepository;

	@Autowired
	private AccountService accountService;



	@Bean
	public BCryptPasswordEncoder getBcrypte(){
		return  new BCryptPasswordEncoder();
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
	/*	Utilisateur utilisateur=accountService.addUser(new Utilisateur("adm1","MedVall","MedVall@gmail.com","admin","1234"));
		Role role =rolesRepository.save(new Role(null,"ADMIN"));
		accountService.AddRoles("admin","ADMIN");

*/
	}
}
