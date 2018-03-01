package com.myproject.learnjava8.initialproject;

import com.myproject.learnjava8.initialproject.interfaces.fourWheeler;
import com.myproject.learnjava8.initialproject.interfaces.vehicle;


public class DefaultMethodImplementationInInterface implements vehicle, fourWheeler {

	 public void print() {
		 vehicle.super.print();
	      fourWheeler.super.print();
	     //static helper method.
	      vehicle.blowHorn();
	      System.out.println("I am a car!");
	   }
	public static void main(String[] args) {
		
		DefaultMethodImplementationInInterface dmi = new DefaultMethodImplementationInInterface();
		dmi.print();
		
	}

}
