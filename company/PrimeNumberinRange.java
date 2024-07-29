public class PrimeNumberinRange {
    static boolean isPrime(int n) {
        // 0, 1 negative numbers are not prime
        if (n < 2)
            return false;
        // checking the number of divisors b/w 2 and the square root of n
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        // if reached here then must be true
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Prime Numbers in range");
        int lower = 1;  // Define the lower bound
        int upper = 20; // Define the upper bound
        
        for (int i = lower; i <= upper; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
}
