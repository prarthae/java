import java.util.*;
import graphics.*;

public class grahpkg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius, length, breadth, side;
        System.out.println("Enter radius : ");
        radius = sc.nextDouble();
        System.out.println("Enter length : ");
        length = sc.nextDouble();
        System.out.println("Enter bredth : ");
        breadth = sc.nextDouble();
        System.out.println("Enter side : ");
        side = sc.nextDouble();

        Circle c = new Circle(radius);
        c.area();
        Rectangle r = new Rectangle(length, breadth);
        r.area();
        Square s = new Square(side);
        s.area();
    }
}
