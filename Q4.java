package str;

import java.util.Arrays;

//Write a program to get the contents of a given string as a byte array.

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Welcome to Globallogic";
		byte[] bytearr=s.getBytes();
		String res=Arrays.toString(bytearr);
		System.out.println(res);
	}

}
