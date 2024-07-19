import java.util.*;

public class complexAdd {
    int real, img;

    complexAdd(int r, int i) {
        real = r;
        img = i;
    }

    complexAdd add_complex(complexAdd c) {
        int r, i;
        r = this.real + c.real;
        i = this.img + c.img;
        return new complexAdd(r, i);
    }

    void display() {
        System.out.println(real + " + " + img + "i");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the real part : ");
        int real = sc.nextInt();
        System.out.println("Enter imaginary part : ");
        int img = sc.nextInt();
        complexAdd c1 = new complexAdd(real, img);
        System.out.println("Enter the real part : ");
        int r = sc.nextInt();
        System.out.println("Enter imaginary part : ");
        int i = sc.nextInt();
        complexAdd c2 = new complexAdd(r, i);

        complexAdd sum = c1.add_complex(c2);
        sum.display();

    }
}
