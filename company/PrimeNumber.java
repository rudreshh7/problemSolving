public class PrimeNumber{
	public static void main(String[] args) {
		int num = 1;
		int factor = 0;

		// edge case for negative number ,0 and 1
		if(num < 2){
			System.out.println("Not a prime number");
			System.exit(0);
		}

		for (int i = n1; i <= num ;i++ ) {
			if(num % i == 0){
				factor++;
			}
			
		}
		if(factor > 2){
				System.out.println("not a prime number");
			}
			else{
				System.out.println(" a prime number");
			}
	}
}