package com.sleniumexpress;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
	
	public  Human() {
		
	}

	Heart heart;
	
	
	public Human(Heart heart) {
		this.heart = heart;
	}
	@Autowired
	@Qualifier("hearthuman")
	public void setHeart(Heart heart) {
		this.heart = heart;
		System.out.println("setter method called for heart");
		System.out.println(heart.getAnimalName() + heart.getNoOfHearts());
	}
	
	public void startPumping()
	{
		heart.pump();
	}
	

}
