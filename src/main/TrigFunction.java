package javatest;

import java.util.ArrayList;
import java.math.BigInteger;

/**
 *
 * @author Rahul Ramkumar
 */
public class TrigFunction {

    public static double getSine(double x) {
        double result = 0;

        for (int i = 0, j = 1, k = 1; i < 20; i++, j = j + 2, k = k * -1) {
            result = result + ((Math.pow(x, j) / factorial(j)) * k);
        }
        return result;
    }

    public static double sin(double x) {
        double result = 0;
        double term = x;

        result = x;
        int j = -1;
        for (int i = 3; i < 100000000; i = i + 2) {
            term = x * x * term / (i * (i - 1));
            result = result + term * j;
            j = j * -1;
        }
        return result;
    }

    static int factorial(int n) {
        if (n == 1) {
            return 1;

        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) 
    {
        long start = System.nanoTime();
        ArrayList<BigInteger> fibonacciNumbers = new ArrayList<BigInteger>();
        int n = 2;  // Index of current Fibonacci number.
        BigInteger tempAns = null;
        BigInteger limit = new BigInteger("10").pow(99); // First 1000-digit number.

        fibonacciNumbers.add(BigInteger.ONE);
        fibonacciNumbers.add(BigInteger.ONE);
        do {
            tempAns = fibonacciNumbers.get(n - 1).add(fibonacciNumbers.get(n - 2));
            fibonacciNumbers.add(tempAns);
            n++;
        } while (tempAns.compareTo(limit) <= 0);

        Long stop = System.nanoTime();
        System.out.println("The first term in the Fibonacci sequence " + " to contain 1,000 digits is term: " + fibonacciNumbers.size());
        System.out.println("Execution time: " + ((stop - start) / 1e+6 + " ms"));
    }
}
