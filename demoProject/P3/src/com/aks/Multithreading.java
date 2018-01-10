package com.aks;

public class Multithreading extends Thread{
	
	public void run() {
		try {
		System.out.println("Thread"+Thread.currentThread().getId()+" "+Thread.currentThread().getName()
				+"is running");
		// TODO Auto-generated method stub
		/*super.run();*/
		}catch(Exception e) {
			System.out.println("Catch Done");
		}finally {
			System.out.println("Finally Done");
		}
	}
}
