public class SumofN{

	static int getSum(int n){
		if(n == 0){
			return n;
		}

		return n + getSum(n-1);


	}
	public static void main(String[] args) {

		int n  = 10;
		int sum = getSum(n);

		System.out.println(sum);

	}
}