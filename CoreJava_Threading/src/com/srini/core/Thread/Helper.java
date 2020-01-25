	package com.srini.core.Thread;

public class Helper implements Runnable {

	@Override
	
		public void run() 
	    { 
	        try
	        { 
	            System.out.println("thread2 going to sleep for 5000"); 
	            Thread.sleep(5000); 
	        }	 catch (InterruptedException e)  
	        { 
	            System.out.println("Thread2 interrupted");} 
	        } 

	

}
