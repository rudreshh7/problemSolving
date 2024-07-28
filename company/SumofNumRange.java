public class SumofNumRange {
    static int getSum(int n1, int n2) {
        if (n1 > n2) {
            return 0;
        }
        return n1 + getSum(n1 + 1, n2);
    }

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;
        int sum = getSum(num1, num2);
        System.out.println("Sum of numbers from " + num1 + " to " + num2 + " is: " + sum);
    }
}