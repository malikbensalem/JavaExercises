package com.qa.primes;

public class Runner {
    public static void main(String args[]) {
        System.out.println(primes(12));
        System.out.println(primes(2));
        System.out.println();

    }

    public static int primes(int max) {
        int count = 0;
        if (max > 1) {
            boolean prime = true;
            for (int i = 2; i <= max; i++, prime = true) {
                for (int j = 2; j <= (int)Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        prime = false;
                        break;
                    }
                }
                if (prime) {
                    count++;
                }
            }

        }
        return count;
    }
}

