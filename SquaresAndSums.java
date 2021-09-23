class SquaresAndSums {
    public static void main(String[] args) {
        final int n = 100;
        System.out.println(SquareOfSum(n)-SumOfSquares(n));
        return;
    }

    public static long SumOfSquares(int n) {
        // Returns the sum of squares up to n inclusive
        long sum = 0L;

        for (long i = 1L; i <= n; i++) {
            sum += i*i;
        }
        return sum;
    }

    public static long SquareOfSum(int n) {
        long sum = (n*(n+1))/2; // Gauss's formula for the sum of first n natural numbers.
        return sum*sum;
    }
}