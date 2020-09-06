package com.codecat.learning;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Origano implements Topping {

	@Override
	public void taste() {
		// TODO Auto-generated method stub
		System.out.println("feeling origano");
	}
}