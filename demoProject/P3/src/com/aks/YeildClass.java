package com.aks;

public class YeildClass extends Thread{
	public void run() {
		
		for (int i = 0; i < 2; i++) {
			System.out.println("Child Thread name "+Thread.currentThread().getName());
		}
		// TODO Auto-generated method stub
	}
}
