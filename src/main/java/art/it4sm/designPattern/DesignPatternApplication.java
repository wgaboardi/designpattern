package art.it4sm.designPattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Provides the classes necessary to create an  
 * desktop application that uses Builder and AbstractFactory design patters
 * to build computer and server objects
 *
 * @since 1.0
 * @see Builder and AbstractFactory design patterns
 */

@SpringBootApplication
public class DesignPatternApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesignPatternApplication.class, args);
	}

}
