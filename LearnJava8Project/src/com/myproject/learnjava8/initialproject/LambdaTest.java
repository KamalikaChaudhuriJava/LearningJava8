package com.myproject.learnjava8.initialproject;

import java.util.Scanner;
/*
 * Lambda expressions are used primarily to define 
 * inline implementation of a functional interface,
 *  i.e., an interface with a single method only.
 *  */
interface MathOperation {
    Double operation(Double a, Double b);
 }

public class LambdaTest {
	
	
    Double CalculationMethod(Double num1, Double num2,MathOperation mathOperation)
	{
		return mathOperation.operation(num1, num2);
	}
	
public static void main(String args[])
{
	Double num1,num2;
	
	Scanner s= new Scanner(System.in);
	try {
	System.out.println("Enter First Number");
	num1=s.nextDouble();
	System.out.println("Enter Second Number");
	num2=s.nextDouble();
	LambdaTest lm = new LambdaTest();
	/*
	 * Lambda expressions are used primarily to define 
	 * inline implementation of a functional interface,
	 *  i.e., an interface with a single method only.
	 *  */
	MathOperation addition= ( number1,  number2)->number1+number2;
	MathOperation subtraction =( number1,  number2)->number1-number2;
	MathOperation Multiplication =( number1,  number2)->number1*number2;
	MathOperation Division =( number1,  number2)->number1/number2;
	System.out.println("addition "+lm.CalculationMethod(num1, num2, addition));
	System.out.println("subtraction "+lm.CalculationMethod(num1, num2, subtraction));
	System.out.println("Multiplication "+lm.CalculationMethod(num1, num2, Multiplication));
	System.out.println("Division "+lm.CalculationMethod(num1, num2, Division));
}
	catch(Exception ime)
	{
		System.out.println("Exception: Input format should be number please re start");
				
	}
	finally
	{
		s.close();	
	}
	
	
}
}

