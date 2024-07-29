public class ArmstrongNumber{
	public static void main(String[] args) {
		// 131 = 1 ^ 3 +3 ^ 3 + 1 ^ 3 
		int digit, sum = 0 , count = 0;
		int originalNumber = 153;
		int n = originalNumber;
		while(n > 0){
			count++;
			n/=10;

		}

		n = originalNumber;
		

		while(n > 0){
			digit = n % 10;
			sum += Math.pow(digit,count);
			n/=10;
		}

		if(sum == originalNumber){
			System.out.println("It is ArmstrongNumber");

		}else{
			System.out.println("It is not a ArmstrongNumber");
		}

}

}
