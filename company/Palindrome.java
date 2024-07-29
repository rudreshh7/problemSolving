public class Palindrome{
	public static void main(String[] args) {
		
		int n = 134351;
		int num = n;
		int digit , reverse = 0; 
		while(num > 0){
			digit  =  num % 10;
			reverse = reverse * 10 + digit;
			num/=10;
		}

		if(reverse == n){
			System.out.println("Palindrome");

		}else{
			System.out.println("Not Palindrome");
		}
	}
}