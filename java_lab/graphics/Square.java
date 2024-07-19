package graphics;

public class Square {
    double a;

    public Square(double side) {
        a = side;
    }

    public void area() {
        System.out.println("Area of square : " + a * a);
    }

}
