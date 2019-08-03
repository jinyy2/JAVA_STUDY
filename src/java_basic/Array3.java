package java_basic;

public class Array3 {

	public static void main(String[] args) {
		int N = 50;
		int[][] arr = new int[N][N];
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				arr[i][j] = (int)(Math.random()*10);
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		

		
	}

}
