class Prime10001 {
    public static void main(String[] args) {
        int primeCounter = 1;
        int i = 3;
        while (primeCounter < 10000) {
            i += 2;
            if (isPrime(i)) {
                primeCounter++;
            }
            
        }
        System.out.println(i);
    }

    public static boolean isPrime(int n) {
        if (n % 2 == 0) return false;
        // We only need to check up to sqrt(n) to test for primality. At least 1 factor must be smaller than this if composite.
        int maxCheck = (int) Math.ceil(Math.sqrt((double) n));
        for (int i = 3; i <= maxCheck; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}