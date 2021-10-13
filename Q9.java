package str;
import java.io.*;
import java.util.*;
//Write a  program to find the longest word in a text file.

public class Q9 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		FileReader f= new FileReader("D:\\Training\\Training1\\src\\str\\f.txt");
		String s="";
		String word;
		Scanner sc= new Scanner(f);
		while(sc.hasNext()) {
			word= sc.next();
			if(word.length()>s.length()) {
				s=word;
			}
		}
		System.out.println("longest word is:"+s);
	}
}
