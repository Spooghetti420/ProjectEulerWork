import helper.SquareRoot;

public class HighlyDivisibleTriangleNumber {
    public static void main(String[] args) {
        int n = 7;   
        while (countFactors(triangleNumber(n)) < 500) {
            n++;
        }
        System.out.println(triangleNumber(n));
    }

    public static long triangleNumber(int n) {
        return (n*(n+1))/2;
    }

    public static int countFactors(long n) {
        int factorCount = 0;
        for (int i = 1; i < SquareRoot.sqrt(n); i++) {
            if (n % i == 0) factorCount += 2;
        }
        return factorCount;
    }
}
