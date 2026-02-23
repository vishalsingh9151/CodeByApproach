//  Check If A Number Is Prime

static boolean isPrime(int n) {
    if (n <= 1) return false;

    for (int j = 2; j * j <= n; j++) {
        if (n % j == 0)
            return false;
    }

    return true;
}


// Count Primes From 2 To k

static int countPrimes(int k) {
    int count = 0;

    for (int i = 2; i <= k; i++) {
        if (isPrime(i))
            count++;
    }

    return count;
}


// Print All Prime Numbers Till k
static void printPrimes(int k) {
    for (int i = 2; i <= k; i++) {
        if (isPrime(i))
            System.out.print(i + " ");
    }
}


//   Optimized Prime Check (Skip Even Numbers)
This is faster.
static boolean isPrimeFast(int n) {
    if (n <= 1) return false;
    if (n == 2) return true;
    if (n % 2 == 0) return false;

    for (int j = 3; j * j <= n; j += 2) {
        if (n % j == 0)
            return false;
    }

    return true;
}
Why faster?
We skip even numbers.
We check only odd divisors.

  
  
//  Complete Example Program
public class PrimeDemo {

    static boolean isPrime(int n) {
        if (n <= 1) return false;

        for (int j = 2; j * j <= n; j++) {
            if (n % j == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        int k = 20;

        System.out.println("Prime numbers till " + k + ":");

        for (int i = 2; i <= k; i++) {
            if (isPrime(i))
                System.out.print(i + " ");
        }
    }
}
