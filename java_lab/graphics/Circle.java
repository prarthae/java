package graphics;

import java.math.*;

public class Circle implements shape {
  double r;

  public Circle(double r1) {
    this.r = r1;
  }

  public void area() {
    System.out.println("The area of circle is = " + (Math.PI * r * r));
  }

}
