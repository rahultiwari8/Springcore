package com.sleniumexpress;

public class Human {
	
	Heart heart;

	public void setHeart(Heart heart) {
		this.heart = heart;
	}
	
	public void startPumping()
	{
		heart.pump();
	}
	

}
