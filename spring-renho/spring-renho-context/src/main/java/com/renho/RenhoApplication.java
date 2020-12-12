package com.renho;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.stream.Stream;

/**
 * @author renho
 * @date 2020/12/12
 */
@ComponentScan("com.renho")
public class RenhoApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(RenhoApplication.class);
		Stream.of(ac.getBeanDefinitionNames()).forEach(System.out::println);
	}

}
