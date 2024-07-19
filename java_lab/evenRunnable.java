import java.util.*;

class even implements Runnable {
    int l1, l2;

    even(int n1, int n2) {
        l1 = n1;
        l2 = n2;
    }

    public void run() {
        for (int i = l1; i < l2; i++) {
            if (i % 2 == 0) {
                System.out.println("even : " + i);
            }
        }
    }
}

class fibonacci implements Runnable {
    int a = 0, b = 1, c, l;

    fibonacci(int n) {
        l = n;
    }

    public void run() {
        for (int i = 0; i < l; i++) {
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;
        }
    }
}

public class evenRunnable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l1, l2, l;
        System.out.println("Enter limit range for even numbers : ");
        l1 = sc.nextInt();
        l2 = sc.nextInt();
        System.out.println("Enter number of fibonacci series  : ");
        l = sc.nextInt();

        Thread e = new Thread(new even(l1, l2));
        Thread f = new Thread(new fibonacci(l));
        e.start();
        f.start();
    }
}
