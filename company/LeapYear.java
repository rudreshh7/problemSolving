public class LeapYear{
	public static void main(String[] args) {
		int num = 2021;

		int temp;

		temp = (num % 4 == 0 && num % 100 != 0) || (num % 400 == 0)?1:0;

		if(temp == 1){
			System.out.println("LeapYear");
		}
		else{
			System.out.println("Not a leap year");
		}
	}
}