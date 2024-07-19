import java.util.*;

class neg extends RuntimeException {
    neg(String s) {
        super(s);
    }
}

public class avgException {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int[] array;
        int size, sum = 0;
        System.out.println("Enter number of integers : ");
        size = sc.nextInt();
        array = new int[size];

        try {
            System.out.println("Enter " + size + " +ve integers");
            for (int i = 0; i < size; i++) {
                array[i] = sc.nextInt();
                if (array[i] < 0) {
                    throw new neg("no negetive entry....");
                }
                sum = sum + array[i];
            }

        } catch (neg e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }

        System.out.println("sum = " + sum);
    }
}
