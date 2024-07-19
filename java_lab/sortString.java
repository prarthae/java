import java.util.*;

public class sortString {
    String[] str;
    int size;
    Scanner sc = new Scanner(System.in);

    sortString(int n) {
        size = n;
        System.out.println("Enter " + n + " words");
        str = new String[n];
        for (int i = 0; i < size; i++) {
            str[i] = sc.next();
        }
    }

    void sort() {
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (str[i].compareTo(str[j]) > 0) {
                    String temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
    }

    void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(str[i] + "\t");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of words : ");
        int n = sc.nextInt();

        sortString s = new sortString(n);
        System.out.println("The string is : ");
        s.display();
        System.out.println("\nThe sorted string is : ");
        s.sort();
        s.display();
    }
}
