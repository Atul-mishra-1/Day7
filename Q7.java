package str;

//Write a method to count all vowels in a string.

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="welcome to globallogic";
		
		System.out.println(getVowelCount(str));
	}

	private static int getVowelCount(String str) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
				count++;
			}
		}
		return count;
	}

}
