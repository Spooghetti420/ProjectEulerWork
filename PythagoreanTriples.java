public class PythagoreanTriples {
    public static void main(String[] args) {
        // a^2 + b^2 = c^2; a + b + c = 1000
        // a + b > c, i.e. a + b + c > 2c
        // 2c < 1000
        // c < 500
        // i.e. a, b < 500
        for (int a = 1;  a < 500; a++) {
            for (int b = 1; b < 500; b++) {
                double cD = (Math.sqrt((double) (a*a) + (double) (b*b)));
                if (cD == Math.round(cD)) {
                    int c = (int) Math.round(cD);
                    if (a + b + c == 1000) {
                        System.out.println(a*b*c);
                        return;
                    }
                }
                
            }
        }
    }
}
