package com.codecat.learning;

import org.springframework.stereotype.Component;

@Component
public class Chilly implements Topping {

	@Override
	public void taste() {
		// TODO Auto-generated method stub
		System.out.println("Muuh mach gya !!");
	}

}
