package com.oops.concept.practice.classes;

public class NestedClasses {

	interface MyCars {
		public void showCars();
	}
	
class CarTest implements MyCars{
		
		public CarTest() {
			System.out.println("Car Test contructor called");
		}

		@Override
		public void showCars() {
			System.out.println("Displaying all cars...");
			
		}
		
		public void testCars() {
			System.out.println("testing all cars...");
			
		}
		
	}
	 static void displayNestedClass() {
//			NestedClasses.Vehicle car1 = new NestedClasses().new Car("Silver", "12345", "Subaru", 200);
//			System.out.println(car1);
			System.out.println("Nested class method displayed");
				
			}
	 
	abstract class Vehicle{
		
		private String color;
		private String vin;
		public abstract String toString();
		
		public Vehicle(String c, String v) {
			System.out.println("Vehicle contructor called");
			this.color = c;
			this.vin = v;
		}
		
	}
	
	class Car extends Vehicle{
		private String brand;
		private int topSpeed;
		
		public Car(String c, String v, String b, int s) {
			super(c, v);
			this.brand = b;
			this.topSpeed = s;
			System.out.println("Car constructor called");
		}

		public String getColor() {
			return super.color;
		}
		
		public String getVin() {
			return super.vin;
		}

		public String getBrand() {
			return brand;
		}



		public void setBrand(String brand) {
			this.brand = brand;
		}



		public int getTopSpeed() {
			return topSpeed;
		}


		public void setTopSpeed(int topSpeed) {
			this.topSpeed = topSpeed;
		}



		@Override
		public String toString() {
			return "Car [brand=" + brand + ", Color=" + getColor() + ", Vin #="+ getVin() + ", topSpeed=" + topSpeed + "]";
		}

	}
	
	
	
	
}


class DemoNestedClasses{
	
	public static void main(String [] args) {
		 NestedClasses.Vehicle nc = new NestedClasses().new Car("Silver", "123456", "Subaru", 201);
		 NestedClasses.CarTest mc = new NestedClasses().new CarTest();
//		NestedClasses.Vehicle car =  new NestedClasses().new Car("Silver", "12345", "Subaru", 200);
//		 NestedClasses.displayNestedClass();
			
		mc.showCars();
		mc.testCars();
//		System.out.println(nc);
	}
}