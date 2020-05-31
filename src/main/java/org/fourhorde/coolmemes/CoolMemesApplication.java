package org.fourhorde.coolmemes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class CoolMemesApplication extends SpringBootServletInitializer {
	private static final Logger log = LoggerFactory.getLogger(CoolMemesApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(CoolMemesApplication.class, args);

		log.info("Hello cool Memes!!!");
	}

}
