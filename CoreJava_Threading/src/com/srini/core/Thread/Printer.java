package com.srini.core.Thread;

public class Printer implements  Runnable{
	
	
	@Override
	public void run() {
		
		for(int i=0; i<50; i++) {
			System.out.println("This is from Chaild Thread : "+Thread.currentThread().getName()+" Thrad Id: "+Thread.currentThread().getId()+" "+i);
		}
	}
	
}
