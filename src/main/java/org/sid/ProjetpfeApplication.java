package org.sid;

import org.sid.dao.HopitalRepository;
import org.sid.entites.Hopital;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjetpfeApplication implements CommandLineRunner {
	@Autowired
 private HopitalRepository hopitalRepository;
	public static void main(String[] args) {
		SpringApplication.run(ProjetpfeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	/*	hopitalRepository.save(new Hopital("marrakech mahaid","ss@gmail.com", "cardie", "mesa7aljanob",06156052));
		hopitalRepository.save(new Hopital("marrakech gelis","kk@gmail.com", "card", "mesa7a dawli",06156052));
		hopitalRepository.save(new Hopital("marrakech dawdiyat","ll@gmail.com", "cardie", "mesa7aljanob",06156052));
		hopitalRepository.save(new Hopital("marrakech","aa@gmail.com", "cardie", "mesa7almatar",06156052));
		*/
	    hopitalRepository.findAll().forEach(c->{
	    	System.out.println(c.getAdresse());
	    });
		
	}

}

