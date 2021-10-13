package str;

import java.io.*;
import java.util.*;

//Write a program to read a plain text file.

public class Q10 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fd= new FileReader("D:\\Training\\Training1\\src\\str\\f.txt");
		Scanner sc= new Scanner(fd);
		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
	}

}
