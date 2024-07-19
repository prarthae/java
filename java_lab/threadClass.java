import java.util.*;

class multiple extends Thread {
    int limit;

    multiple(int n) {
        limit = n;
    }

    public void run() {
        for (int i = 1; i <= limit; i++) {
            System.out.println(i + "*5  = " + i * 5);
        }
    }
}

class prime extends Thread {
    int limit;

    prime(int l) {
        limit = l;
    }

    int isprime(int x) {
        for (int i = 2; i < x / 2; i++) {
            if (x % i == 0) {
                return 0;
            }
        }
        return 1;
    }

    public void run() {
        int p = limit;
        for (int i = 1; i < limit; i++) {
            if (isprime(i) == 1) {
                System.out.println("prime : " + i);
            }
        }

    }
}

public class threadClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l1, l2;
        System.out.println("Enter limit for table : ");
        l1 = sc.nextInt();
        System.out.println("Enter limit for prime : ");
        l2 = sc.nextInt();
        prime p1 = new prime(l2);
        multiple m1 = new multiple(l1);
        m1.start();
        p1.start();
    }
}
