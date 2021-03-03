package circ;


class Circle {

  public static void main(String[] args) {
    Circle c = new Circle();
    System.out.println(c.getArea());
    c.setR(10);
    c.setX(5);
    c.setY(2);
    System.out.println(c.getArea());
  }

  private double x,y;
  private double r = 1;

  public Circle(double x, double y) {
    this.x = x;
    this.y = y;
  }
  public Circle() {
    this.x = 0;
    this.y = 0;
  }

  public double getArea() {
    return 2*Math.PI*r;
  }

  public void setX(double x) {this.x = x;}

  public void setY(double y) {this.y = y;}

  public void setR(double r) {
    if (r <=0)
      throw new IllegalArgumentException("A kor sugara nagyobb mint nulla");
    this.r = r;
    }

}