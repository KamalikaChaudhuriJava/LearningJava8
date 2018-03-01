package com.myproject.learnjava8.initialproject.interfaces;

public interface vehicle {
      //default method
	  default void print() {
	      System.out.println("I am a vehicle!");
	   }
	  //static helper method
	  static void blowHorn() {
	      System.out.println("Blowing horn!!!");
	   }
}
