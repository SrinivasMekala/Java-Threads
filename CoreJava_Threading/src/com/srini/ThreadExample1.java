package com.srini;

public class ThreadExample1 extends Thread{
	public static void main (String args[]) {
		Thread thread = new Thread();
		System.out.println(" First Thread :getId :  "+thread.getId());
		System.out.println(" First Thread :getName :  "+thread.getName());
		System.out.println(" First Thread :getPriority :  "+thread.getPriority());
		System.out.println(" First Thread :hashCode :  "+thread.hashCode());
		System.out.println(" First Thread :toString :  "+thread.toString());
		System.out.println(" First Thread :MIN_PRIORITY :  "+thread.MIN_PRIORITY);
		System.out.println(" First Thread :NORM_PRIORITY :  "+thread.NORM_PRIORITY);
		System.out.println(" First Thread :MAX_PRIORITY :  "+thread.MAX_PRIORITY);
		System.out.println(" First Thread :isAlive :  "+thread.isAlive());
		//System.out.println(" First Thread :hashCode :  "+thread.start());
	}
	
	 

}
