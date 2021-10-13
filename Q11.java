package str;

import java.util.Scanner;

//Write a program that reads an integer and check whether it is negative, zero, or positive

public class Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a integer");
		int a= sc.nextInt();
		if(a>0) {
			System.out.println("positive number");
		}
		if(a==0) {
			System.out.println("Zero");
		}
		if(a<0) {
			System.out.println("negative number");
		}
	}

}
