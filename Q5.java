package str;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr1= {{1,2,3},{2,3,1},{3,2,1}};
		int[][] arr2= {{4,5,6},{5,6,4},{6,5,4}};
		int[][] sum= new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				sum[i][j]=arr1[i][j]+arr2[i][j];
				System.out.print(sum[i][j]+" ");
			}
			System.out.println();
		}
	}

}
