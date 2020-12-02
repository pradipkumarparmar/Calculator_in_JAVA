package com.pro1;
import java.util.Scanner;
public class table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter The number ");
		int a = obj.nextInt();
		
		int n;
		int ans;
		
		for (n=1;n<=10;n++)
		{
			ans=a*n;
			
			System.out.println(a+"*"+n+"="+ans);
		}
	}

}
