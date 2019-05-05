import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final int maxn = 805;
        BigInteger f[] = new BigInteger[maxn];
        f[1] = BigInteger.ZERO;
        f[2] = BigInteger.ONE;
        for (int i = 3; i < maxn; i++) {
            f[i] = (f[i - 2].add(f[i - 1])).multiply(BigInteger.valueOf(i - 1));
        }
        Scanner in = new Scanner(System.in);
        int n;
        while (true) {
            n = in.nextInt();
            if (n == -1) {
                break;
            }
            System.out.println(f[n]);
        }
    }
}
