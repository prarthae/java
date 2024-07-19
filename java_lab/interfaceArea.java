import java.util.*;
import java.math.*;

interface area {
    public void area_of();

    public void perimeter();
}

class circle implements area {
    double r;
    Scanner sc = new Scanner(System.in);

    circle() {
        System.out.println("Enter radius : ");
        r = sc.nextDouble();
    }

    public void area_of() {
        System.out.println("Area of circle = " + (Math.PI * r * r));
    }

    public void perimeter() {
        System.out.println("Perimeter of circle = " + (Math.PI * 2 * r));
    }
}

class reactangle implements area {
    double l, b;
    Scanner sc = new Scanner(System.in);

    reactangle() {
        System.out.println("Enter length : ");
        l = sc.nextDouble();
        System.out.println("Enter breadth : ");
        b = sc.nextDouble();
    }

    public void area_of() {
        System.out.println("Area of rectangle = " + l * b);
    }

    public void perimeter() {
        System.out.println("Perimeter of rectangle : " + (2 * (l + b)));
    }
}

public class interfaceArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch;
        do {
            System.out.println("\n1.Circle \n2.Rectangle \nExit \nEnter ur coice : ");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    circle c = new circle();
                    c.area_of();
                    c.perimeter();
                    break;
                case 2:
                    reactangle r = new reactangle();
                    r.area_of();
                    r.perimeter();
                    break;
                case 3:
                    System.out.println("Exiting........");
                    break;

                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } while (ch != 3);
    }
}
