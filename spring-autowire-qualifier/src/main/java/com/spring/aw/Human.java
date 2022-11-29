package com.spring.aw;

public class Human {
	private Heart heart;

	public Human(Heart heart) {
		this.heart = heart;
	}

	public void setHeart(Heart heart) {
		this.heart = heart;
		System.out.println("setter method called");
	}

	public void startPumping() {
		if (heart != null) {
			heart.pump();
		} else {
			System.out.println("heart not pumping");
		}
	}

}
