package ss2_loop.bai_tap;

public class twenty_prime {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; count < 20; i++) {
            if (isPrime(i)) {
                System.out.println(i + " ");
                count++;
            }

        }
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
