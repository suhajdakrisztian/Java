package negyedikhazi;

import negyedikhazi.utils.*;

class Main {
  public static void main(String[] args) {
    double [] arr1 = {1.0,2.0,3.0};
    double [] arr2 = {99.0,98.0,97.0};
    double [] arr3 = {111.0,222.0,333.0,44.0};

    double n = 5;

    Vector v1 = new Vector(arr1);
    Vector v2 = new Vector(arr2);
    Vector v3 = new Vector(arr3);

    v1.addArray(arr2);
    System.out.println(v1.toString());
    v1.multByScalar(3);
    System.out.println(v1.toString());
    v1.subtractArray(arr2);
    System.out.println(v1.toString());
    double res = v1.multiplyArray(arr2);
    System.out.println(res);
    v2.addArray(arr3);
  }
}