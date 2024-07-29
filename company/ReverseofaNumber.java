public class ReverseofaNumber{
	public static void main(String[] args) {
		int n = 123,reverse = 0, digit;


		while(n < 0){
			digit = n % 10;
			reverse = reverse * 10 + digit;

			n/=10;
		}
	}
}