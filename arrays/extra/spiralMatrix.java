public class spiralMatrix{
	public static void main(String[] args) {
		System.out.println("Spiral Matrix");
		// Leetcode 54

		int[][] matrix = {
			{1,2,3,4},
			{5,6,7,8},
			{9,10,11,12},
			{13,14,15,16}
		} 

		int n = martrix.length;
		


		int lb = 0;

		int ub = n -1;

		while(lb <= ub){
			for(i = lb; i <=ub;i++){
				matrix[lib][i];

			}

			for (i =lb+1;i<=ub;i++ ) {
				matrix[i][ub];
				
			}
			for (i = ub;i>=lb ; i--) {
				matrix[ub][i];
				
			}

			for (i = ub -1;i > lb ;i--) {
				arr[i][lb];
				lb++ , ub--;
				System.out.println("Spiral Order": + i);


			}

		}
	}
}