import helper.CheckPrime;

class LargestPrimeFactor {
    public static void main(String[] args) {
        final long num = 600851475143L;
        final long highest = (long) Math.floor(Math.sqrt((double) num));

        for (long l = highest-1; l > 3; l-=2) {
            if (num % l == 0 && CheckPrime.isPrime(l)) {
                System.out.println(l);
                return;
            }
        }
    }
}