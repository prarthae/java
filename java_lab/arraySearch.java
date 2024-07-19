import java.util.*;

public class arraySearch {
    int[] a;
    int size;
    Scanner sc = new Scanner(System.in);

    arraySearch(int n) {
        a = new int[n];
        System.out.println("Enter " + n + " elements to the array");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
    }

    void search(int p) {
        int el = p;
        int f = 0;
        for (int i = 0; i < size; i++) {
            if (a[i] == el) {
                f = 1;
                System.out.println("found");
                break;
            }
        }
        if (f == 0) {
            System.out.println("not found");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        arraySearch arry = new arraySearch(n);
        System.out.println("Enter element to be search : ");
        int el = sc.nextInt();
        arry.search(el);
    }
}
