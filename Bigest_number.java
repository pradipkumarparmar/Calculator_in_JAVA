package com.pro1;
import java.util.Scanner;
public class Bigest_number {

	public static void main(String[] args) {
			Scanner obj = new Scanner(System.in);
			
			System.out.print("Enter The First Value:");
			int a=obj.nextInt();
			
			System.out.print("Enter The Second Value");
			int b=obj.nextInt();
			
			System.out.print("Enter The  Third Value:");
			int c=obj.nextInt();
			
			
			if(a>b && a>c) {
				System.out.println("First Value is Big.");
				
			}
			else if(b>a && b>c) {
				System.out.println("Second Value is Big");
			}
			else {
				System.out.println("Third value is big");
			}
			
			
			

	}

}
