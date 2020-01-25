package com.srini.core;

public class ThreadExp1 extends Thread {
	
	public void run() {
		System.out.println("##############3   inside Run Method ");
	}

	public static void main(String args[]) {
		ThreadExp1 t=new ThreadExp1();
		t.start();
	
	}
	
}
