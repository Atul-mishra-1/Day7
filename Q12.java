package str;

import java.util.Scanner;

//Write a program that accepts three numbers from the user and prints "increasing" 
//if the numbers are in increasing order, "decreasing" if the numbers 
//are in decreasing order, and "Neither increasing or decreasing order" otherwise.

public class Q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter three numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a<b && b<c)
			System.out.println("Increasing");
		else if(a>b && b>c)
			System.out.println("Decreasing");
		else
			System.out.println("Neither increasing nor decreasing");
		}
}
