class Solution {
    public double myPow(double x, int n) {
        
        // Base condition: If n is 0, x^0 is 1
        if (n == 0) {
            return 1;
        }
        
        long N = n;
        
        if (N < 0) {
            N = -N;
            x = 1 / x;
        }

        if (N % 2 == 0) {
            return myPow(x * x, (int) (N / 2));
        } 
    
        
        else {
            return x * myPow(x, (int) (N - 1));
        }
    }
}
