public class patternNine{
	public static void main(String[] args) {
		// Outer Loop 1
		for (int i = 0;i < 5 ; i++) {
			for (int j = 1;j <5-i ; j++) {
				System.out.print(" ");
				
			}
			for (int j = 0; j <2* i +1; j++) {
				System.out.print("*");

			}

			// for (int j = 1 ; j <5-i ; j++ ) {
			// 	System.out.print(" ");
				
			// }



					System.out.println();

			
		}
		for (int i = 0; i < 5;i++ ) {
			for (int j = 0; j < i;j++ ) {
				System.out.print(" ");
				
			}
			
	

		for (int j = 0; j < 2*5-2*i ;j++ ) {
			System.out.print("*");
			
		}

		for (int j = 0;j < 5;j++ ) {
			System.out.print(" ");
		}

	System.out.println();

	}
}
}