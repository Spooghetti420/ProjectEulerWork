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
        if (n % 2 == 0) return false;
        final long highest = (long) Math.floor(Math.sqrt((double) n));
        for (long k = 3; k < highest; k+=2) {
            if (n % k == 0) {
                return false;
            }
        }
        return true;
    }
}