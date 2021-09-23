class FibonacciSum {
    public static void main(String[] args) {
        int fibPrev = 1;
        int fibCurr = 2;
        int sum = 0;
        while (fibCurr < 4e6) {
            if (fibCurr % 2 == 0) {
                sum += fibCurr;
            }
            
            int temp = fibCurr;
            fibCurr = fibPrev + fibCurr;
            fibPrev = temp;
        }

        System.out.println(sum);
    }
}