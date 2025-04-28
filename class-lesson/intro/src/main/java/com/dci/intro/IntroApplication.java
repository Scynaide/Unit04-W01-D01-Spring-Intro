package com.dci.intro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IntroApplication implements CommandLineRunner {
//	3 ways to inject dependancies
//	1. field injection
//	2. constructor injection
//	3. setter injection

//	1. Field Injection
//	@Autowired
	GameRunner gameRunner;

//	2. constructor injection
	@Autowired
	public IntroApplication(GameRunner gameRunner) {
		this.gameRunner = gameRunner;
	}


//	3. Setter Injection
//	@Autowired
	public void setGameRunner(GameRunner gameRunner){
		this.gameRunner = gameRunner;
	}


	public static void main(String[] args) {
		var context = SpringApplication.run(IntroApplication.class, args);


//		displays all the beans I have in my application
		String[] allBeans = context.getBeanDefinitionNames();
		for (String beanName : allBeans) {
			Object bean = context.getBean(beanName);
			String className = bean.getClass().getName();

			if (className.startsWith("com.dci") || bean instanceof String || className.startsWith("omar")) {
				System.out.println(beanName + " -> " + bean);
			}
		}



	}




	@Override
	public void run(String... args) throws Exception {

		System.out.println("Dependancies have been injected");
		gameRunner.run();
	}
}
