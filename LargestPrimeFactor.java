class LargestPrimeFactor {
    public static void main(String[] args) {
        final long num = 600851475143L;
        final long highest = (long) Math.floor(Math.sqrt((double) num));

        for (long l = highest-1; l > 3; l-=2) {
            if (num % l == 0 && isPrime(l)) {
                System.out.println(l);
                return;
            }
        }
    }

    public static boolean isPrime(long n) {
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