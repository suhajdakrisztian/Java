package pointm;
import point2d.*;
/*
public - mindenki latja, mindenki hozzafer
private - 
protected -
package private - 
*/
public class Main {
  public static void main(String[] args) {
    System.out.println("asdf");
    Point p = new Point();
    System.out.println("Def values are: " + p.getX() + " " + p.getY());
    p.setX(5);
    p.setY(99);
    System.out.println("New values are: " + p.getX() + " " + p.getY());
    p.mirror(p);
  }
}