public class CheckPrime {
    public static boolean isPrime(int n) {
        if (n == 2) return true;
        // We only need to check up to sqrt(n) to test for primality. At least 1 factor must be smaller than this if composite.
        int maxCheck = (int) Math.ceil(Math.sqrt((double) n));
        for (int i = 2; i <= maxCheck; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
