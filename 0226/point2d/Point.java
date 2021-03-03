package point2d;

public class Point {
  private double x, y;

  public Point(double x, double y){
      this.x = x;
      this.y = y;
  }

  public Point(){
      x = 0;
      y = 0;
  }

  public void move(double dx, double dy){
      x += dx;
      y += dy;
  }

  public void mirror(Point p) {
    if (p.x == x && p.y == y)
    throw new IllegalArgumentException("More ebbu baj lesz");
    x += 2 * (p.x - x);
    y += 2 * (p.y - y);
  }

  public double getX() { return this.x;}
  public double getY() { return this.y;}

  public void setX( double n) { this.x = n;}
  public void setY( double n) { this.y = n;}

  double distance(Point p){
      return Math.sqrt(((x - p.x) * (x - p.x)) + ((y - p.y) * (y - p.y)));
  }
}