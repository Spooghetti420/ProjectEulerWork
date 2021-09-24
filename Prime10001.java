import helper.CheckPrime;

class Prime10001 {
    public static void main(String[] args) {
        int primeCounter = 1;
        int i = 3;
        while (primeCounter < 10000) {
            i += 2;
            if (CheckPrime.isPrime(i)) {
                primeCounter++;
            }
            
        }
        System.out.println(i);
    }
}