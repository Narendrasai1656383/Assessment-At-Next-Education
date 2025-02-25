package Assessment;

import java.util.Arrays;

public class One {

	public static void main(String[] args) {
		int[][] arr=new int[][] {{1,2,3,10},{4,5,6,11},{7,8,9,12},{13,14,15,16}};
		System.out.println("Original Matrix:");
		System.out.println(Arrays.deepToString(arr));
		int[][] res=new int[arr.length][arr.length];
		System.out.println("Output for Clockwise:");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				res[i][j]=arr[(j+arr.length)%arr.length][i];
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length/2;j++) {
				int temp=res[i][j];
				res[i][j]=res[i][arr.length-j-1];
				res[i][arr.length-j-1]=temp;
			}
		}
		System.out.println(Arrays.deepToString(res));
		System.out.println("Output for Anti-clockwise:");
		res=new int[arr.length][arr.length];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				res[i][j]=arr[(j+arr.length)%arr.length][(i+arr.length)%arr.length];
			}
		}
		for(int i=0;i<arr.length/2;i++) {
			int[] temp=res[i];
			res[i]=res[arr.length-i-1];
			res[arr.length-i-1]=temp;
		}
		System.out.println(Arrays.deepToString(res));
	}

}
