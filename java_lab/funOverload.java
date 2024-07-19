import java.util.*;
import java.math.*;

public class funOverload {
    void area(float l, float b) {
        System.out.println("Area of Rectangle = " + (l * b));
    }

    void area(double h, double b) {
        System.out.println("Area of Triangle = " + (0.5 * b * h));
    }

    void area(double r) {
        System.out.println("Area of Circle = " + (Math.PI * r * r));
    }

    void area(float a) {
        System.out.println("Area of Square = " + (Math.pow(a, 2)));
    }

    public static void main(String[] args) {
        funOverload f = new funOverload();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length and breadth of rectangle: ");
        float l = sc.nextFloat();
        float b = sc.nextFloat();

        System.out.println("Enter side of square: ");
        float a = sc.nextFloat();

        System.out.println("Enter height and breadth of triangle : ");
        double t1 = sc.nextFloat();
        double t2 = sc.nextFloat();

        System.out.println("Enter radius of circle : ");
        double r = sc.nextFloat();

        f.area(a);
        f.area(r);
        f.area(l, b);
        f.area(t1, t2);

    }
}
