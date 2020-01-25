package com.srini.core.Thread;

public class ThreadApplication extends Thread{
	public static void main (String args[]) {
		
		Printer pt= new Printer();
		Thread pt1 = new Thread(pt);
		pt1.start();
		System.out.println("This is from main Thread: ");
		for(int h=0; h<30; h++) {
			System.out.println("Main Thread : "+Thread.currentThread().getName()+" Thrad Id: "+Thread.currentThread().getId()+"  "+h);
		}	
	}



}
