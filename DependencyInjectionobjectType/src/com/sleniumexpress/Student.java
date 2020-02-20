package com.sleniumexpress;


public class Student {
	
	private Cheat cheat ;

	public void setCheat(Cheat cheat) {
		this.cheat = cheat;
	}
	
	
	public void cheatmethod()
	{
		cheat.cheat();
	}
}
