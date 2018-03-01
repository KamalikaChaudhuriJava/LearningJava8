package com.myproject.learnjava8.initialproject;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateFunctionalInterfaces {

	public static void main(String[] args) {
		/* Returns a fixed-size list backed by the specified array.
		 *  (Changes to the returned list "write through" to the array.) 
		This method acts as bridge between array-based and collection-based APIs,
		 in combination with Collection.toArray(). 
		*/
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
	      // Predicate<Integer> predicate = n -> true
	      // n is passed as parameter to test method of Predicate interface
	      // test method will always return true no matter what value n has.
			
	      System.out.println("Print all numbers:");
			
	      //pass n as parameter
	      check(list, n->true);
			
	      // Predicate<Integer> predicate1 = n -> n%2 == 0
	      // n is passed as parameter to test method of Predicate interface
	      // test method will return true if n%2 comes to be zero
			
	      System.out.println("Print even numbers:");
	      check(list, n-> n%2 == 0 );
			
	      // Predicate<Integer> predicate2 = n -> n > 3
	      // n is passed as parameter to test method of Predicate interface
	      // test method will return true if n is greater than 3.
			
	      System.out.println("Print odd numbers :");
	      check(list, n-> n%2 != 0 );
	   }
		
	   public static void check(List<Integer> list, Predicate<Integer> predicate) {

	      for(Integer n: list) {

	         if(predicate.test(n)) {
	            System.out.print(n + ", ");
	         }
	      }
          System.out.println();
	}

}
