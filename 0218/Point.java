class Point {

  double x,y;
  public Point(double x, double y) {
    this.x = x;
    this.y = y;
  }

  void move(double dx, double dy) {
     this.x += dx;
     this.y += dy;
  }

  void mirror(double dx, double dy) {
    x = 2*(dx-x);
    y = 2*(dy-y);
  }

 public static void main(String[] args) {
   Point p= new Point(3,4);
   p.move(7, 7);
   System.out.println(p.x + " " + p.y);
   p.mirror(0, 0);
   System.out.println(p.x + " " + p.y);
 }
}
