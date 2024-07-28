public class GreatestAmongThree{
	public static void main(String[] args) {

		int num1 = 34, num2 = 37, num3 =2;

	int temp, result;
	temp = num1 > num2 ? num1 : num2;

	result = temp > num3 ? temp : num3;

	System.out.println(result);

		
	}
}