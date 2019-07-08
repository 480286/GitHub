package com.Exercise.test;

public class Thread1 extends Thread{

	 public String name;

	    public Thread1(String name) {
	        this.name = name;
	    } 

	    public void run() {
	        for (int i = 0; i < 5; i++) {
	            for (long k = 0; k < 100000000; k++) ;
	            System.out.println(name + ": " + i);
	        } 
	    } 
}
