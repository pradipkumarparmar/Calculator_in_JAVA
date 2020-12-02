package com.pro1;
import java.util.Scanner;
/*
 
* @author pradip parmar
* @version 15.0.1
* @ 2020-11-23
 
*/


public class calculator {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner obj1= new Scanner(System.in);
		
		Scanner obj2 = new Scanner(System.in);
		

		
		System.out.print("Enter First Value :");
		int a = obj1.nextInt();
		
		System.out.print("Enter Second Value :");
		int b = obj2.nextInt();
		
		int c = a+b;
		int d = a-b;
		int e = a/b;
		int f = a*b;
		
		
		System.out.println(" + your Addition is  :"+c);
		System.out.println(" - your Subtraction is  :"+d);
		System.out.println(" / your Division is  :"+e);
		System.out.println(" * your multiplication is  :"+f);
		
		
		
	}

}
