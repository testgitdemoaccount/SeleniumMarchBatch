package com.selenium.org;

public class Demo {
	
	public static void main(String[] args) {
		POJO p = new POJO();
		
		int b = p.getA();  //10
		System.out.println(b);
		
		p.setA(30);   //30
		
		System.out.println(p.getA()); 
		
		p.setA(50);
		
		System.out.println(p.getA());
		
		
	}

}
