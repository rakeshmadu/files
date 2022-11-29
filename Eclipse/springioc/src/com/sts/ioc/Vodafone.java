package com.sts.ioc;

public class Vodafone implements Sim{

	@Override
	public void calling() {
		System.out.println("calling using vodafone sim"); 
		
	}

	@Override
	public void data() {
		System.out.println("browsing using vodafone sim");
		
		
	}
	

}