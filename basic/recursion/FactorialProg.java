public class FactorialProg{

	public static int factorial(int n){
		if(n <= 1){
			return 1; //  Base case : factorial of 0 or 1 is 1
		}else{
			return n  * factorial(n-1); // Recursive Case
		}
	}

	public static void main(String[] args) {
	int n = 5;



	}
}