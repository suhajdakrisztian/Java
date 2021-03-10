class elso {

  public static void main(String[] args) {
    Point[] arr = new Point[3];

  for(int i = 0; i < 3; i++) {
    double x = Double.parseDouble(System.console().readLine());
    double y = Double.parseDouble(System.console().readLine());
    Point temp = new Point(x,y);
    arr[i] = temp;
  }

  Point result = elso.getWeightCenter(arr);
  System.out.println(result.x + " " + result._y);

  }

  public Point getWeightCenter(double[] parr) {
    double avgx = 0;
    double avgy = 0;

    for(int i = 0; i < parr.length; i++) {
      avgx = avgx + parr[i]._x;
      avgy = avgy + parr[i]._y;
    }
    Point ret = new Point(avgx/parr.length, avgy/parr.length);
    return ret;
  }
}

class Point {
  public double _x;
  public double _y;

  Point(double x, double y) {
    this._x = x;
    this._y = y;
  }
}
