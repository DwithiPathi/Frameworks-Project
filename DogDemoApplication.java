package com.example.dogdemo;
/**
 * 
 * @author s546908-Dwithi Reddy Pathi Reddy
 *
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class DogDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext appContext = SpringApplication.run(DogDemoApplication.class, args);
		System.out.println("Hi Spring");
		
		Dog d1=appContext.getBean(Dog.class);
		Trainer t1=appContext.getBean(Trainer.class);
		t1.setId(22);
		t1.setName("Dwithi");
		
		System.out.println(d1);
		d1.setId(12);
		d1.setName("puppy1");
		d1.setBreed("pug1");
		d1.setTrainer(t1);
		System.out.println(d1);
		
		Dog d2=appContext.getBean(Dog.class);
		Trainer t2=appContext.getBean(Trainer.class);
		t1.setId(33);
		t1.setName("Harika");
		System.out.println(d2);
		d2.setId(13);
		d2.setName("puppy2");
		d2.setBreed("pug2");
		d2.setTrainer(t2);
		System.out.println(d2);
		//System.out.println(d1);
	}

}
