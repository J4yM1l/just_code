package com.oops.concept.practice;

public abstract class Animal {
	
	 private int legs;
	 protected abstract String animalType();
	 public abstract String toString();

	public Animal(int type) {
		// TODO Auto-generated constructor stub
		 System.out.println("Animal contructor is called");
	        this.legs = type;
	}
	
	 public int getLegs(){
	        return legs;
	    }
	 
}


