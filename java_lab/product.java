import java.util.*;

public class product {
    int pcode;
    double price;
    String pname;
    Scanner sc = new Scanner(System.in);

    product() {
        System.out.println("Enter product name : ");
        pname = sc.next();
        System.out.println("Enter product code : ");
        pcode = sc.nextInt();
        System.out.println("Enter price : ");
        price = sc.nextDouble();
    }

    void display() {
        System.out.println("PCODE : " + pcode);
        System.out.println("PNAME : " + pname);
        System.out.println("PRICE : " + price);
    }

    product compare(product p2, product p3) {
        product p4;
        if ((this.price > p2.price) && (this.price > p3.price)) {
            p4 = this;
        } else if (p2.price > p3.price) {
            p4 = p2;
        } else {
            p4 = p3;
        }
        return p4;
    }

    public static void main(String[] args) {
        product p1 = new product();
        product p2 = new product();
        product p3 = new product();
        product p4;

        p4 = p1.compare(p2, p3);
        p4.display();
    }
}
