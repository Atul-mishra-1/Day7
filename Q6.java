package str;

//Write a method to display the first 50 pentagonal numbers
public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=50;i++) {
			System.out.printf("%d ",getNumbers(i));
		}
	}

	private static int getNumbers(int i) {
		// TODO Auto-generated method stub
		return (i*(3*i-1))/2;
	}
}
