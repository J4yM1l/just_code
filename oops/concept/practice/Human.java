package com.oops.concept.practice;

public class Human extends Animal {

	int numOfLegs;
    String color;
	public Human(int type, String col) {
		super(type);
		System.out.println("Human constructor called");
		this.numOfLegs = type;
		this.color = col;
	}

	@Override
	protected
	String animalType() {
		if(numOfLegs == 2) {
			return color+" Human";
		}
		return "Dog";
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Animal type is "+ animalType() + " with "+ super.getLegs() + " legs";
	}

}
