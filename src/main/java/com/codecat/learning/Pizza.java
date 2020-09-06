package com.codecat.learning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Pizza {
	@Autowired
	public Topping topping;
	
	public void eat () {
		topping.taste();
	}
}
