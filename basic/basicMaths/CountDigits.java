public class CountDigits{
	public static void main(String[] args) {
	System.out.println("Counting Digits");
	int n =  7781; // total digits is 5
	int count = 0;

	

	while( n > 0){
		count++;
		n = n / 10;

	}

	System.out.println(count);






	}
}