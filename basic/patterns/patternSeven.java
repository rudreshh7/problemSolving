public class patternSeven{
	public static void main(String[] args) {
		// rows = 5 col = 9 
		for (int i = 0;i <5 ;i++ ) {
			for (int j = 0; j < 5 - i ; j++) {
				System.out.print(" ");
				
			}
			for (int j =0; j <2* i+1;j++ ) {
				System.out.print("*");
				
			}

			for (int j = 0; j< 5 - i;j++ ) {
				System.out.print(" ");
				
			}
			System.out.println(); 


}
}
		}