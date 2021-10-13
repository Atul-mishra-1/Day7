package str;

//Write a program to check whether a given string starts with the contents of another string.

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1= "Hello world start programming";
		String str2= "Hello world";
		String str3= str1.substring(0, str2.length());
		boolean res=str3.equals(str2);
		System.out.println(res);
		
	}

}
