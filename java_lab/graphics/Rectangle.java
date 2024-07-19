package graphics;

public class Rectangle {
    double l, b;

    public Rectangle(double len, double be) {
        l = len;
        b = be;
    }

    public void area() {
        System.out.println("Area of rectangle : " + l * b);
    }

}
