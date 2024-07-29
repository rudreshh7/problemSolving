public class SumofDigits{

	public static void main(String[] args) {
		// Sum of digits of a number

		int n = 1234;
		int sum = 0 ;
		int num = n;

		while(num > 0){
			int digit = n % 10 ;
			sum += digit;
			num = num /10;

		}

		System.out.println(sum);
		
	}
}