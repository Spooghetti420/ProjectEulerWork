import helper.CheckPrime;

public class PrimeSum {
    public static void main(String[] args) {
        long sum = 0L;
        for (int i = 2; i < 2e6; i++) {
            if (CheckPrime.isPrime(i)) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
