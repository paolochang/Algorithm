package Math.Java;

public class _0050_PowXN {

  public double myPow(double x, int n) {
    if (n == 0) return 1;
    if (x == 1) return 1;
    if (x == -1) {
        if (n % 2 == 0) return 1;
        else return -1;
    }
    if (n == Integer.MIN_VALUE) return 0;
    if (n < 0) {
        n = -n;
        x = 1/x;
    }
    double ans = 1.0;
    while (n > 0) {
        if ((n & 1) != 0) // n % 2 != 0;
            ans *= x;
        x = x * x;
        n >>= 1; // n = n / 2;
    }
    return ans;
  }
}
