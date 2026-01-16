 public class PrimeCheck {
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        System.out.println(isPrime(11));  // Output: true
        System.out.println(isPrime(15));  // Output: false
    }
}
