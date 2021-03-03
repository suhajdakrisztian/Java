package 

import circ.Circle;

class Main {
  public static void main(String[] args) {
    Circle c = new Circle();
    System.out.println(c.getArea());
    c.setR(10);
    c.setX(5);
    c.setY(2);
    System.out.println(c.getArea());
  }

}