package str;

//Write a program to get the index of all the characters of the alphabet.

public class Q2 {

 public static void main(String[] args) {
  // TODO Auto-generated method stub
	 String str= "hello world";
	int i1=str.indexOf('h');
	int i2=str.indexOf('e');
	int i3=str.indexOf('l');
	int i4=str.indexOf('o');
	int i5=str.indexOf('w');
	int i6=str.indexOf('r');
	int i7=str.indexOf('d');
	System.out.println("index of 'h': "+i1);
	System.out.println("index of 'e': "+i2);
	System.out.println("index of 'l': "+i3);
	System.out.println("index of 'o': "+i4);
	System.out.println("index of 'w': "+i5);
	System.out.println("index of 'r': "+i6);
	System.out.println("index of 'd': "+i7);
 }
}
