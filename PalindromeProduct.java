class PalindromeProduct {
    public static void main(String[] args) {
        int largestProduct = 0;
        for (int i = 999; i > 99; i--) {
            for (int j = 999; j > 99; j--) {
                int product = i*j;
                String productString = Integer.toString(product);
                StringBuilder sb = new StringBuilder(productString);
                String reversed = sb.reverse().toString();

                if (productString.equals(reversed)) {
                    if (product > largestProduct) {
                        largestProduct = product;
                    }            
                }
            }
        }
        System.out.println(largestProduct);
    }
}