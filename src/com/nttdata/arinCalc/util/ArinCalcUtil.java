package com.nttdata.arinCalc.util;

import java.util.Scanner;

import com.nttdata.arinCalc.main.ArinCalc;

public class ArinCalcUtil {
	Scanner scanner = new Scanner(System.in);
	
	public void fullCalc() {
		calculate(askForNum1(), askForFunc(), askForNum2());
	}
	
	
	public double askForNum1() {
		double num1 = 0;
		try {
			System.out.println("Please insert the first num: ");
			num1 = scanner.nextDouble();
			}catch(Exception e) {
				System.out.println("Please only enter a number: ");
				ArinCalc.main(null);	
			}
		return num1;
	}
	
	public char askForFunc() {
		char func = 0;
		try {
			System.out.println("Please enter the function (+ , - , * , /) you want to perform: ");
			String test = scanner.next();
			if(test.equals("+") || test.equals("-") || test.equals("*") || test.equals("/")) {
			func = test.charAt(0);
			}else {
				System.out.println(test);
				System.out.println("wrong symbol");
				System.out.println("Please only enter a symbol: ");
				
				askForFunc();
			}
			}catch(Exception e) {
				askForFunc();
			}
		return func;		
	}

	public double askForNum2() {
		double num2 = 0;
		try {
			System.out.println("Please insert the second num: ");
			num2 = scanner.nextDouble();
			}catch(Exception e) {
				System.out.println("Please only enter a number: ");
				askForNum2();	
			}
		return num2;
	}
	
	
public void calculate(double num1, char func, double num2) {
	double ans;
	
	switch(func) {
    case '+' :
       System.out.println("Addition of " + num1 + " and " + num2); 
       ans = addition(num1, num2);
       System.out.println(ans);
       ArinCalc.main(null);
       break;
       
    case '-' :
    	System.out.println("Subtraction of " + num1 + " and " + num2);
    	ans = subtraction(num1, num2);
        System.out.println(ans);
        ArinCalc.main(null);
    	break;
    	
    case '*' :
    	System.out.println("Multiplication of " + num1 + " and " + num2); 
    	ans = multiplication(num1, num2);
        System.out.println(ans);
        ArinCalc.main(null);
       break;
       
    case '/' :
    	System.out.println("Division of " + num1 + " and " + num2); 
    	ans = division(num1, num2);
        System.out.println(ans);
        ArinCalc.main(null);
       break;
       
    
	}
	
}

	public double addition (double num1, double num2) {
			double ans = num1 + num2;
			return ans;
		}
		
	public double subtraction (double num1, double num2) {
		double ans = num1 - num2;
		return ans;
		}
	
	public double multiplication (double num1, double num2) {
		double ans = num1 * num2;
		return ans;
	}
	
	public double division (double num1, double num2) {
		double ans = num1 / num2;
		return ans;
	}

	
}
