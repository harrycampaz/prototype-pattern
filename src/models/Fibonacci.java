package models;

public class Fibonacci extends Sequence {

    public Fibonacci() {
        result = nFibonacci(1000);
    }

    private static long nFibonacci(int n) {
        long f0 = 0;
        long f1 = 1;

        for (int i = 1; i <= n; i ++){
            f0 = f0 + f1;
            f1 = f0 - f1;
        }

        return f0;
    }
}
