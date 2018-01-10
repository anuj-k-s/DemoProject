package com.aks;

public class ThreadI implements Runnable {
	public ThreadI() {
		System.out.println("Inside TheadI cons");
		// TODO Auto-generated constructor stub
	}
	@Override
	public void run() {
		System.out.println("Starting run method of Threadi");
		 // moving thread2 to timed waiting state
        try
        {
        	System.out.println("State of Thread"+Thread.currentThread().getState());
        	System.out.println("Thread2 sleeping for 1500 ");
            Thread.sleep(1500);
        } 
        catch (InterruptedException e) 
        {
            e.printStackTrace();
        }
         
        try
        {
        	System.out.println("Thread2 sleeping for 1500 ");
            Thread.sleep(1500);
            } 
        catch (InterruptedException e) 
        {
            e.printStackTrace();
        }
        System.out.println("State of thread1 while it called join() method on thread2 -"+
           ThreadTest.thread1.getState());
        try
        { 
        	System.out.println("Thread2 sleeping for 200");
            Thread.sleep(200);
        } 
        catch (InterruptedException e) 
        {
            e.printStackTrace();
        }    
	}
}
