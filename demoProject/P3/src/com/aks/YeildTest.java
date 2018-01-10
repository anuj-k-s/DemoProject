package com.aks;

public class YeildTest {
	
	public static void main(String[] args) throws InterruptedException {
		
	
	YeildClass class1 = new YeildClass();
	class1.start();

	for (int i = 0; i < 2; i++) {
		Thread.sleep(1500);;
		System.out.println("Main Thread name "+Thread.currentThread().getName()+"With priority"+Thread.currentThread().getPriority());
		
	}
		}
}
