package helper;

public class SquareRoot {
    // public static void main(String[] args) {
    //     System.out.println(sqrt(1023));
    // }
    
    public static long sqrt(long n) {
        int i = 0;
        while (i*i <= n) {
            i++;
        }
        i--;
        return i;
    }
}
