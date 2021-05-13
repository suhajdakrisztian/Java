package polyhedra;

import java.lang.Math.*;

abstract class Prism {
  protected int _height;
  abstract double baseArea();
  double volume() { return _height * baseArea(); }
}

class Cylinder extends Prism {
  private int _radius;

  public Cylinder(int iHeight, int iRadius) {
    _height = iHeight;
    _radius = iRadius;
  }

  @Override
  double baseArea() { return Math.pow(_radius, 2) * Math.PI; }



  public String toString() {
    String res = "Cylinder : (h=" + _height + " , r=" + _radius + ")";
    return res;
  }
}

class Cube extends Prism {

  public Cube(int iHeight) {
    _height = iHeight;
  }

  @Override
  double baseArea() { return Math.pow(_height, 2); }


  public String toString() {
    String res = "Cube : (h=" + _height + ")";
    return res;
  }

}


public class solution {

  public static void main(String[] args) {

    Cylinder c = new Cylinder(10,5);

    System.out.println(c.baseArea());
    System.out.println(c.volume());
    System.out.println(c.toString());

    Cube d = new Cube(4);

    System.out.println(d.baseArea());
    System.out.println(d.volume());
    System.out.println(d.toString());

  }
}